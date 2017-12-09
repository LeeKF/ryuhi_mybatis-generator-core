/**
*
 */
package com.ryuhi.demo.sstx.dao.mapper;

import com.ryuhi.demo.sstx.dao.model.MallModuleEntity;
import com.ryuhi.demo.sstx.dao.model.MallModuleEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MallModuleEntityMapper {
    long countByExample(MallModuleEntityExample example);

    int deleteByExample(MallModuleEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallModuleEntity record);

    int insertSelective(MallModuleEntity record);

    List<MallModuleEntity> selectByExample(MallModuleEntityExample example);

    MallModuleEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallModuleEntity record, @Param("example") MallModuleEntityExample example);

    int updateByExample(@Param("record") MallModuleEntity record, @Param("example") MallModuleEntityExample example);

    int updateByPrimaryKeySelective(MallModuleEntity record);

    int updateByPrimaryKey(MallModuleEntity record);
}