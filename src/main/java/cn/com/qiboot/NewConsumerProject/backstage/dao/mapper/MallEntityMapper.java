/**
*
 */
package cn.com.qiboot.NewConsumerProject.backstage.dao.mapper;

import cn.com.qiboot.NewConsumerProject.backstage.dao.model.MallEntity;
import cn.com.qiboot.NewConsumerProject.backstage.dao.model.MallEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MallEntityMapper {
    long countByExample(MallEntityExample example);

    int deleteByExample(MallEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallEntity record);

    int insertSelective(MallEntity record);

    List<MallEntity> selectByExample(MallEntityExample example);

    MallEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallEntity record, @Param("example") MallEntityExample example);

    int updateByExample(@Param("record") MallEntity record, @Param("example") MallEntityExample example);

    int updateByPrimaryKeySelective(MallEntity record);

    int updateByPrimaryKey(MallEntity record);
}