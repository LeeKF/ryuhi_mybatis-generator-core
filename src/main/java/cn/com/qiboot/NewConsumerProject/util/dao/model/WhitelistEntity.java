/**
*
 */
package cn.com.qiboot.NewConsumerProject.util.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WhitelistEntity implements Serializable {
    private Long id;

    /**
     *   IP地址
     */
    private String ipAddress;

    /**
     *   业务类型id，即该白名单是供哪个业务使用的，如物流业务、短信业务等
     */
    private Integer businessType;

    /**
     *   是否被禁用，1为被禁用，0为启用，默认为0
     */
    private Boolean isDisabled;

    /**
     *   创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     *   更新时间
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 671559874779333232L;
}