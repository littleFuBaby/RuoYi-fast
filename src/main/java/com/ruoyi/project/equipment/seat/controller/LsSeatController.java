package com.ruoyi.project.equipment.seat.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.equipment.seat.domain.LsSeat;
import com.ruoyi.project.equipment.seat.service.ILsSeatService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 座位Controller
 * 
 * @author andy
 * @date 2022-09-21
 */
@Controller
@RequestMapping("/equipment/seat")
public class LsSeatController extends BaseController
{
    private String prefix = "equipment/seat";
    //private String prefix = "system/user";

    @Autowired
    private ILsSeatService lsSeatService;

    @RequiresPermissions("equipment:seat:view")
    @GetMapping()
    public String seat()
    {
        return prefix + "/seat";
    }

    /**
     * 查询座位列表
     */
    @RequiresPermissions("equipment:seat:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LsSeat lsSeat)
    {
        startPage();
        List<LsSeat> list = lsSeatService.selectLsSeatList(lsSeat);
        return getDataTable(list);
    }

    /**
     * 导出座位列表
     */
    @RequiresPermissions("equipment:seat:export")
    @Log(title = "座位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LsSeat lsSeat)
    {
        List<LsSeat> list = lsSeatService.selectLsSeatList(lsSeat);
        ExcelUtil<LsSeat> util = new ExcelUtil<LsSeat>(LsSeat.class);
        return util.exportExcel(list, "座位数据");
    }

    /**
     * 新增座位
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存座位
     */
    @RequiresPermissions("equipment:seat:add")
    @Log(title = "座位", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LsSeat lsSeat)
    {
        return toAjax(lsSeatService.insertLsSeat(lsSeat));
    }

    /**
     * 修改座位
     */
    @RequiresPermissions("equipment:seat:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LsSeat lsSeat = lsSeatService.selectLsSeatById(id);
        mmap.put("lsSeat", lsSeat);
        return prefix + "/edit";
    }

    /**
     * 修改保存座位
     */
    @RequiresPermissions("equipment:seat:edit")
    @Log(title = "座位", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LsSeat lsSeat)
    {
        return toAjax(lsSeatService.updateLsSeat(lsSeat));
    }

    /**
     * 删除座位
     */
    @RequiresPermissions("equipment:seat:remove")
    @Log(title = "座位", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(lsSeatService.deleteLsSeatByIds(ids));
    }
}
