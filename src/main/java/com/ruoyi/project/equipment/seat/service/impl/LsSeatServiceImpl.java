package com.ruoyi.project.equipment.seat.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.equipment.seat.mapper.LsSeatMapper;
import com.ruoyi.project.equipment.seat.domain.LsSeat;
import com.ruoyi.project.equipment.seat.service.ILsSeatService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 座位Service业务层处理
 * 
 * @author andy
 * @date 2022-09-21
 */
@Service
public class LsSeatServiceImpl implements ILsSeatService 
{
    @Autowired
    private LsSeatMapper lsSeatMapper;

    /**
     * 查询座位
     * 
     * @param id 座位主键
     * @return 座位
     */
    @Override
    public LsSeat selectLsSeatById(Long id)
    {
        return lsSeatMapper.selectLsSeatById(id);
    }

    /**
     * 查询座位列表
     * 
     * @param lsSeat 座位
     * @return 座位
     */
    @Override
    public List<LsSeat> selectLsSeatList(LsSeat lsSeat)
    {
        return lsSeatMapper.selectLsSeatList(lsSeat);
    }

    /**
     * 新增座位
     * 
     * @param lsSeat 座位
     * @return 结果
     */
    @Override
    public int insertLsSeat(LsSeat lsSeat)
    {
        lsSeat.setCreateTime(DateUtils.getNowDate());
        return lsSeatMapper.insertLsSeat(lsSeat);
    }

    /**
     * 修改座位
     * 
     * @param lsSeat 座位
     * @return 结果
     */
    @Override
    public int updateLsSeat(LsSeat lsSeat)
    {
        lsSeat.setUpdateTime(DateUtils.getNowDate());
        return lsSeatMapper.updateLsSeat(lsSeat);
    }

    /**
     * 批量删除座位
     * 
     * @param ids 需要删除的座位主键
     * @return 结果
     */
    @Override
    public int deleteLsSeatByIds(String ids)
    {
        return lsSeatMapper.deleteLsSeatByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除座位信息
     * 
     * @param id 座位主键
     * @return 结果
     */
    @Override
    public int deleteLsSeatById(Long id)
    {
        return lsSeatMapper.deleteLsSeatById(id);
    }
}
