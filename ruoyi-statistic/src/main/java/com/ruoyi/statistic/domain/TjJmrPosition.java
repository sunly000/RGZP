package com.ruoyi.statistic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 岗位信息对象 jmr_position
 * 
 * @author liangliang
 * @date 2020-10-02
 */
public class TjJmrPosition extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 岗位标号 */
    private Long pId;

    /** 岗位名字 */
    @Excel(name = "岗位名字")
    private String pName;

    public void setpId(Long pId) 
    {
        this.pId = pId;
    }

    public Long getpId() 
    {
        return pId;
    }
    public void setpName(String pName) 
    {
        this.pName = pName;
    }

    public String getpName() 
    {
        return pName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pId", getpId())
            .append("pName", getpName())
            .toString();
    }
}
