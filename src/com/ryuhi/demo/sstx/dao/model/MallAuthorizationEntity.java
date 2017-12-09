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
public class MallAuthorizationEntity implements Serializable {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   用户ID
     */
    private Long userId;

    /**
     *   角色ID
     */
    private Long roleId;

    /**
     *   角色名称，冗余字段
     */
    private String roleName;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 1664759548856007565L;
}