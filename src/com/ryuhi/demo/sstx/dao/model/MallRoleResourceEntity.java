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
public class MallRoleResourceEntity implements Serializable {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   角色ID
     */
    private Long roleId;

    /**
     *   权限资源ID
     */
    private Long resourceId;

    /**
     *   权限资源名称，冗余字段
     */
    private String resourceName;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 48977032913128385L;
}