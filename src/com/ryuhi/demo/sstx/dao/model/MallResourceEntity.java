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
public class MallResourceEntity implements Serializable {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   商城id
     */
    private Long mallId;

    /**
     *   url地址
     */
    private String url;

    /**
     *   名称
     */
    private String name;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 173875805577790680L;
}