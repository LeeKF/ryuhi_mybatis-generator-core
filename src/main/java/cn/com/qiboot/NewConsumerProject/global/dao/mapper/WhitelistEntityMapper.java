/**
*
 */
package cn.com.qiboot.NewConsumerProject.global.dao.mapper;

import cn.com.qiboot.NewConsumerProject.util.dao.model.WhitelistEntity;
import cn.com.qiboot.NewConsumerProject.util.dao.model.WhitelistEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WhitelistEntityMapper {
    long countByExample(WhitelistEntityExample example);

    int deleteByExample(WhitelistEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WhitelistEntity record);

    int insertSelective(WhitelistEntity record);

    List<WhitelistEntity> selectByExample(WhitelistEntityExample example);

    WhitelistEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WhitelistEntity record, @Param("example") WhitelistEntityExample example);

    int updateByExample(@Param("record") WhitelistEntity record, @Param("example") WhitelistEntityExample example);

    int updateByPrimaryKeySelective(WhitelistEntity record);

    int updateByPrimaryKey(WhitelistEntity record);
}