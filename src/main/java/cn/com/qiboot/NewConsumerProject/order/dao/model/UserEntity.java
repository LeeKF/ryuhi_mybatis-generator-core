/**
*
 */
package cn.com.qiboot.NewConsumerProject.order.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements Serializable {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   商城id
     */
    private Long mallId;

    /**
     *   姓名
     */
    private String name;

    /**
     *   昵称
     */
    private String nickname;

    /**
     *   密码
     */
    private String password;

    /**
     *   手机号
     */
    private String mobile;

    /**
     *   状态，0为正常，-10为删除，-20为彻底删除，-30为冻结
     */
    private Byte status;

    /**
     *   注册时间
     */
    private LocalDateTime regtime;

    /**
     *   头像
     */
    private String avatar;

    /**
     *   是否删除，1为删除，0为未删除，2为彻底删除，默认为0
     */
    private Byte isDelete;

    /**
     *   电子邮件地址
     */
    private String email;

    /**
     *   性别（0：保密，1：男，2：女）
     */
    private Byte gender;

    /**
     *   0：买家注册，1：系统生成
     */
    private Byte applyType;

    /**
     *   注册平台类型1：PC，2：手机，3：PAD
     */
    private Byte registerType;

    /**
     *   支付密码
     */
    private String payPassword;

    /**
     *   密码的盐值
     */
    private String salt;

    /**
     *   用户备注
     */
    private String memo;

    /**
     *   注册时的ip
     */
    private String registerIp;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 1088607882247649400L;
}