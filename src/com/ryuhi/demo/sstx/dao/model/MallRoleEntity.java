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
public class MallRoleEntity implements Serializable {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   店铺id
     */
    private Long mallId;

    /**
     *   冗余字段
     */
    private String roleName;

    /**
     *   介绍
     */
    private String intro;

    /**
     *   是否拥有所有权限，1为是，0为不是
     */
    private Boolean hasFullPrivilege;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 3192221890274845220L;
}