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
public class MallModuleEntity implements Serializable {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   店铺id
     */
    private Long mallId;

    /**
     *   顶部菜单id
     */
    private Long topMenuId;

    /**
     *   模块名称，供循环导航菜单图标用
     */
    private String moduleName;

    /**
     *   是否在页面右上角，0为不是，1为是
     */
    private Boolean isRight;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 350497491039987525L;
}