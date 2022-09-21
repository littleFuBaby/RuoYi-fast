package com.ruoyi.project.equipment.seat.mapper;

import java.util.List;
import com.ruoyi.project.equipment.seat.domain.LsSeat;

/**
 * 座位Mapper接口
 * 
 * @author andy
 * @date 2022-09-21
 */
public interface LsSeatMapper 
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
     * 删除座位
     * 
     * @param id 座位主键
     * @return 结果
     */
    public int deleteLsSeatById(Long id);

    /**
     * 批量删除座位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLsSeatByIds(String[] ids);
}
