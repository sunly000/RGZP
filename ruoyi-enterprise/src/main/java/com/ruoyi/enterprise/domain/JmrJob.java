package com.ruoyi.enterprise.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 企业岗位要求对象 jmr_job
 * 
 * @author liangliang
 * @date 2020-09-28
 */
public class JmrJob extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 岗位id */
    private Long jId;

    /** 招聘岗位 */
    @Excel(name = "招聘岗位")
    private Long jPoId;

    /** 性别要求 */
    @Excel(name = "性别要求")
    private Long jSex;

    /** 学历要求 */
    @Excel(name = "学历要求")
    private Long jEHistory;

    /** 招聘院校层次 */
    @Excel(name = "招聘院校层次")
    private Long jCLevel;

    /** 外语水平 */
    @Excel(name = "外语水平")
    private Long jFLanguage;

    /** 专业要求 */
    @Excel(name = "专业要求")
    private Long jPrId;

    /** 薪资范围 */
    @Excel(name = "薪资范围")
    private Long jSRange;

    /** 就业意向地 */
    @Excel(name = "就业意向地")
    private Long jECity;

    /** 岗位要求 */
    @Excel(name = "岗位要求")
    private String jPRequire;

    /** 福利待遇 */
    @Excel(name = "福利待遇")
    private String jWelfare;

    /** 需求人数 */
    @Excel(name = "需求人数")
    private Long jNeedNumber;

    /** 备注 */
    @Excel(name = "备注")
    private String jRemark;

    /** 过期时间 */
    @Excel(name = "过期时间")
    private String jExpire;

    /** 企业id */
    @Excel(name = "企业id")
    private Long jCId;
    private JmrCompany jmrCompany;
    private JmrPosition jmrPosition;
    private JmrProfession jmrProfession;
    public JmrPosition getJmrPosition() {
        return jmrPosition;
    }

    public void setJmrPosition(JmrPosition jmrPosition) {
        this.jmrPosition = jmrPosition;
    }

    public JmrProfession getJmrProfession() {
        return jmrProfession;
    }

    public void setJmrProfession(JmrProfession jmrProfession) {
        this.jmrProfession = jmrProfession;
    }

    public JmrCompany getJmrCompany() {
        return jmrCompany;
    }

    public void setJmrCompany(JmrCompany jmrCompany) {
        this.jmrCompany = jmrCompany;
    }

    public void setjId(Long jId)
    {
        this.jId = jId;
    }

    public Long getjId() 
    {
        return jId;
    }
    public void setjPoId(Long jPoId) 
    {
        this.jPoId = jPoId;
    }

    public Long getjPoId() 
    {
        return jPoId;
    }
    public void setjSex(Long jSex) 
    {
        this.jSex = jSex;
    }

    public Long getjSex() 
    {
        return jSex;
    }
    public void setjEHistory(Long jEHistory) 
    {
        this.jEHistory = jEHistory;
    }

    public Long getjEHistory() 
    {
        return jEHistory;
    }
    public void setjCLevel(Long jCLevel) 
    {
        this.jCLevel = jCLevel;
    }

    public Long getjCLevel() 
    {
        return jCLevel;
    }
    public void setjFLanguage(Long jFLanguage) 
    {
        this.jFLanguage = jFLanguage;
    }

    public Long getjFLanguage() 
    {
        return jFLanguage;
    }
    public void setjPrId(Long jPrId) 
    {
        this.jPrId = jPrId;
    }

    public Long getjPrId() 
    {
        return jPrId;
    }
    public void setjSRange(Long jSRange) 
    {
        this.jSRange = jSRange;
    }

    public Long getjSRange() 
    {
        return jSRange;
    }
    public void setjECity(Long jECity) 
    {
        this.jECity = jECity;
    }

    public Long getjECity() 
    {
        return jECity;
    }
    public void setjPRequire(String jPRequire) 
    {
        this.jPRequire = jPRequire;
    }

    public String getjPRequire() 
    {
        return jPRequire;
    }
    public void setjWelfare(String jWelfare) 
    {
        this.jWelfare = jWelfare;
    }

    public String getjWelfare() 
    {
        return jWelfare;
    }
    public void setjNeedNumber(Long jNeedNumber) 
    {
        this.jNeedNumber = jNeedNumber;
    }

    public Long getjNeedNumber() 
    {
        return jNeedNumber;
    }
    public void setjRemark(String jRemark) 
    {
        this.jRemark = jRemark;
    }

    public String getjRemark() 
    {
        return jRemark;
    }
    public void setjExpire(String jExpire) 
    {
        this.jExpire = jExpire;
    }

    public String getjExpire() 
    {
        return jExpire;
    }
    public void setjCId(Long jCId) 
    {
        this.jCId = jCId;
    }

    public Long getjCId() 
    {
        return jCId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("jId", getjId())
            .append("jPoId", getjPoId())
            .append("jSex", getjSex())
            .append("jEHistory", getjEHistory())
            .append("jCLevel", getjCLevel())
            .append("jFLanguage", getjFLanguage())
            .append("jPrId", getjPrId())
            .append("jSRange", getjSRange())
            .append("jECity", getjECity())
            .append("jPRequire", getjPRequire())
            .append("jWelfare", getjWelfare())
            .append("jNeedNumber", getjNeedNumber())
            .append("jRemark", getjRemark())
            .append("jExpire", getjExpire())
            .append("jCId", getjCId())
            .toString();
    }
}
