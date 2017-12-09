/**
*
 */
package com.ryuhi.demo.sstx.dao.mapper;

import com.ryuhi.demo.sstx.dao.model.MallMenuEntity;
import com.ryuhi.demo.sstx.dao.model.MallMenuEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MallMenuEntityMapper {
    long countByExample(MallMenuEntityExample example);

    int deleteByExample(MallMenuEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMenuEntity record);

    int insertSelective(MallMenuEntity record);

    List<MallMenuEntity> selectByExample(MallMenuEntityExample example);

    MallMenuEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMenuEntity record, @Param("example") MallMenuEntityExample example);

    int updateByExample(@Param("record") MallMenuEntity record, @Param("example") MallMenuEntityExample example);

    int updateByPrimaryKeySelective(MallMenuEntity record);

    int updateByPrimaryKey(MallMenuEntity record);
}