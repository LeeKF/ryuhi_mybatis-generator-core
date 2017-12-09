/**
*
 */
package com.ryuhi.demo.sstx.dao.mapper;

import com.ryuhi.demo.sstx.dao.model.MallAuthorizationEntity;
import com.ryuhi.demo.sstx.dao.model.MallAuthorizationEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MallAuthorizationEntityMapper {
    long countByExample(MallAuthorizationEntityExample example);

    int deleteByExample(MallAuthorizationEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallAuthorizationEntity record);

    int insertSelective(MallAuthorizationEntity record);

    List<MallAuthorizationEntity> selectByExample(MallAuthorizationEntityExample example);

    MallAuthorizationEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallAuthorizationEntity record, @Param("example") MallAuthorizationEntityExample example);

    int updateByExample(@Param("record") MallAuthorizationEntity record, @Param("example") MallAuthorizationEntityExample example);

    int updateByPrimaryKeySelective(MallAuthorizationEntity record);

    int updateByPrimaryKey(MallAuthorizationEntity record);
}