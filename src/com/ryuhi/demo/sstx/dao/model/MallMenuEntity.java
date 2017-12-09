/**
*
 */
package com.ryuhi.demo.sstx.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MallMenuEntity implements Serializable {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   商城id
     */
    private Long mallId;

    /**
     *   资源id
     */
    private Long resourceId;

    /**
     *   名称
     */
    private String name;

    /**
     *   上级菜单id
     */
    private Long parentId;

    /**
     *   根目录id
     */
    private Long rootId;

    /**
     *   菜单层级
     */
    private Byte level;

    /**
     *   菜单位置，1为头部导航，2为左边导航
     */
    private Byte position;

    /**
     *   排序编号，数字最小的排在前面，大的排在后面
     */
    private Integer sort;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 309142356778485230L;
}