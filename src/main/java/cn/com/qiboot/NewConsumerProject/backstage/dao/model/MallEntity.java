/**
*
 */
package cn.com.qiboot.NewConsumerProject.backstage.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MallEntity implements Serializable {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   商城名称
     */
    private String name;

    /**
     *   商城logo
     */
    private String logo;

    /**
     *   商城简介
     */
    private String intro;

    /**
     *   是否为收费用户，0收费，1普通用户
     */
    private Boolean isFree;

    /**
     *   过期日期
     */
    private LocalDateTime expireDate;

    /**
     *   公司名称
     */
    private String title;

    /**
     *   手机号
     */
    private String mobile;

    /**
     *   密码
     */
    private String password;

    /**
     *   密码的盐值
     */
    private String salt;

    /**
     *   邮箱
     */
    private String email;

    /**
     *   状态（0：禁用，1：启用）
     */
    private Boolean status;

    /**
     *   商家来源（0：微分销官网，2：公司官网）
     */
    private Integer source;

    /**
     *   注册时的ip
     */
    private String registerIp;

    /**
     *   是否被删除，1为被删除，0为未被删除，默认0
     */
    private Boolean isDelete;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 1971788898293285868L;
}