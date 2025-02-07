package com.ruoyi.enterprise.service;

import java.util.List;
import com.ruoyi.enterprise.domain.PpJmrStudent;

/**
 * 手动匹配Service接口
 * 
 * @author liangliang
 * @date 2020-10-03
 */
public interface IPpJmrStudentService 
{
    /**
     * 查询手动匹配
     * 
     * @param sId 手动匹配ID
     * @return 手动匹配
     */
    public PpJmrStudent selectPpJmrStudentById(Long sId);

    /**
     * 查询手动匹配列表
     * 
     * @param ppJmrStudent 手动匹配
     * @return 手动匹配集合
     */
    public List<PpJmrStudent> selectPpJmrStudentList(PpJmrStudent ppJmrStudent);

    /**
     * 新增手动匹配
     * 
     * @param ppJmrStudent 手动匹配
     * @return 结果
     */
    public int insertPpJmrStudent(PpJmrStudent ppJmrStudent);

    /**
     * 修改手动匹配
     * 
     * @param ppJmrStudent 手动匹配
     * @return 结果
     */
    public int updatePpJmrStudent(PpJmrStudent ppJmrStudent);

    /**
     * 批量删除手动匹配
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePpJmrStudentByIds(String ids);

    /**
     * 删除手动匹配信息
     * 
     * @param sId 手动匹配ID
     * @return 结果
     */
    public int deletePpJmrStudentById(Long sId);
}
