package com.cookingBird.subject.infra.generate.dao;

import com.cookingBird.subject.infra.generate.entity.GenSubjectCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 题目分类(GenSubjectCategory)表数据库访问层
 *
 * @author makejava
 * @since 2024-04-09 22:35:30
 */
public interface GenSubjectCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    GenSubjectCategory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param genSubjectCategory 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<GenSubjectCategory> queryAllByLimit(GenSubjectCategory genSubjectCategory, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param genSubjectCategory 查询条件
     * @return 总行数
     */
    long count(GenSubjectCategory genSubjectCategory);

    /**
     * 新增数据
     *
     * @param genSubjectCategory 实例对象
     * @return 影响行数
     */
    int insert(GenSubjectCategory genSubjectCategory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<GenSubjectCategory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<GenSubjectCategory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<GenSubjectCategory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<GenSubjectCategory> entities);

    /**
     * 修改数据
     *
     * @param genSubjectCategory 实例对象
     * @return 影响行数
     */
    int update(GenSubjectCategory genSubjectCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

