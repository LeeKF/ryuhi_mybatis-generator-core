/**
*
 */
package com.ryuhi.demo.sstx.dao.mapper;

import com.ryuhi.demo.sstx.dao.model.MallRoleResourceEntity;
import com.ryuhi.demo.sstx.dao.model.MallRoleResourceEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MallRoleResourceEntityMapper {
    long countByExample(MallRoleResourceEntityExample example);

    int deleteByExample(MallRoleResourceEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallRoleResourceEntity record);

    int insertSelective(MallRoleResourceEntity record);

    List<MallRoleResourceEntity> selectByExample(MallRoleResourceEntityExample example);

    MallRoleResourceEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallRoleResourceEntity record, @Param("example") MallRoleResourceEntityExample example);

    int updateByExample(@Param("record") MallRoleResourceEntity record, @Param("example") MallRoleResourceEntityExample example);

    int updateByPrimaryKeySelective(MallRoleResourceEntity record);

    int updateByPrimaryKey(MallRoleResourceEntity record);
}