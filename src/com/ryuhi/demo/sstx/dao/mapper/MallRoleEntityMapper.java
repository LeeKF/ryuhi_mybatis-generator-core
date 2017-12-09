/**
*
 */
package com.ryuhi.demo.sstx.dao.mapper;

import com.ryuhi.demo.sstx.dao.model.MallRoleEntity;
import com.ryuhi.demo.sstx.dao.model.MallRoleEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MallRoleEntityMapper {
    long countByExample(MallRoleEntityExample example);

    int deleteByExample(MallRoleEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallRoleEntity record);

    int insertSelective(MallRoleEntity record);

    List<MallRoleEntity> selectByExample(MallRoleEntityExample example);

    MallRoleEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallRoleEntity record, @Param("example") MallRoleEntityExample example);

    int updateByExample(@Param("record") MallRoleEntity record, @Param("example") MallRoleEntityExample example);

    int updateByPrimaryKeySelective(MallRoleEntity record);

    int updateByPrimaryKey(MallRoleEntity record);
}