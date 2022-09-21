package com.ruoyi.project.equipment.seat.service;

import java.util.List;
import com.ruoyi.project.equipment.seat.domain.LsSeat;

/**
 * 座位Service接口
 * 
 * @author andy
 * @date 2022-09-21
 */
public interface ILsSeatService 
{
    /**
     * 查询座位
     * 
     * @param id 座位主键
     * @return 座位
     */
    public LsSeat selectLsSeatById(Long id);

    /**
     * 查询座位列表
     * 
     * @param lsSeat 座位
     * @return 座位集合
     */
    public List<LsSeat> selectLsSeatList(LsSeat lsSeat);

    /**
     * 新增座位
     * 
     * @param lsSeat 座位
     * @return 结果
     */
    public int insertLsSeat(LsSeat lsSeat);

    /**
     * 修改座位
     * 
     * @param lsSeat 座位
     * @return 结果
     */
    public int updateLsSeat(LsSeat lsSeat);

    /**
     * 批量删除座位
     * 
     * @param ids 需要删除的座位主键集合
     * @return 结果
     */
    public int deleteLsSeatByIds(String ids);

    /**
     * 删除座位信息
     * 
     * @param id 座位主键
     * @return 结果
     */
    public int deleteLsSeatById(Long id);
}
