package com.ruoyi.project.equipment.seat.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 座位对象 ls_seat
 * 
 * @author andy
 * @date 2022-09-21
 */
public class LsSeat extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    @Excel(name = "")
    private String seatId;

    /**  */
    @Excel(name = "")
    private String seatName;

    /**  */
    @Excel(name = "")
    private Long seatNo;

    /**  */
    @Excel(name = "")
    private Long seatStatus;

    /**  */
    @Excel(name = "")
    private Long isDelete;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setSeatId(String seatId)
    {
        this.seatId = seatId;
    }

    public String getSeatId()
    {
        return seatId;
    }
    public void setSeatName(String seatName)
    {
        this.seatName = seatName;
    }

    public String getSeatName()
    {
        return seatName;
    }
    public void setSeatNo(Long seatNo)
    {
        this.seatNo = seatNo;
    }

    public Long getSeatNo()
    {
        return seatNo;
    }
    public void setSeatStatus(Long seatStatus)
    {
        this.seatStatus = seatStatus;
    }

    public Long getSeatStatus()
    {
        return seatStatus;
    }
    public void setIsDelete(Long isDelete)
    {
        this.isDelete = isDelete;
    }

    public Long getIsDelete()
    {
        return isDelete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("seatId", getSeatId())
            .append("seatName", getSeatName())
            .append("seatNo", getSeatNo())
            .append("seatStatus", getSeatStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
