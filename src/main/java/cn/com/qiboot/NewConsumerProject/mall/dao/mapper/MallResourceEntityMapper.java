/**
*
 */
package cn.com.qiboot.NewConsumerProject.mall.dao.mapper;

import cn.com.qiboot.NewConsumerProject.mall.dao.model.MallResourceEntity;
import cn.com.qiboot.NewConsumerProject.mall.dao.model.MallResourceEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MallResourceEntityMapper {
    long countByExample(MallResourceEntityExample example);

    int deleteByExample(MallResourceEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallResourceEntity record);

    int insertSelective(MallResourceEntity record);

    List<MallResourceEntity> selectByExample(MallResourceEntityExample example);

    MallResourceEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallResourceEntity record, @Param("example") MallResourceEntityExample example);

    int updateByExample(@Param("record") MallResourceEntity record, @Param("example") MallResourceEntityExample example);

    int updateByPrimaryKeySelective(MallResourceEntity record);

    int updateByPrimaryKey(MallResourceEntity record);
}