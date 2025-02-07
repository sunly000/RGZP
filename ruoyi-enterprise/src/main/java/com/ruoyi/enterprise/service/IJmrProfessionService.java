package com.ruoyi.enterprise.service;

import com.ruoyi.enterprise.domain.JmrProfession;

import java.util.List;

/**
 * 专业信息Service接口
 * 
 * @author liangliang
 * @date 2020-09-29
 */
public interface IJmrProfessionService 
{
    /**
     * 查询专业信息
     * 
     * @param pId 专业信息ID
     * @return 专业信息
     */
    public JmrProfession selectJmrProfessionById(Long pId);

    /**
     * 查询专业信息列表
     * 
     * @param jmrProfession 专业信息
     * @return 专业信息集合
     */
    public List<JmrProfession> selectJmrProfessionList(JmrProfession jmrProfession);

    /**
     * 新增专业信息
     * 
     * @param jmrProfession 专业信息
     * @return 结果
     */
    public int insertJmrProfession(JmrProfession jmrProfession);

    /**
     * 修改专业信息
     * 
     * @param jmrProfession 专业信息
     * @return 结果
     */
    public int updateJmrProfession(JmrProfession jmrProfession);

    /**
     * 批量删除专业信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrProfessionByIds(String ids);

    /**
     * 删除专业信息信息
     * 
     * @param pId 专业信息ID
     * @return 结果
     */
    public int deleteJmrProfessionById(Long pId);
}
