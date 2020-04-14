package cn.amos.boot.dao.entity;

import cn.amos.boot.model.enums.ApplyStatusEnum;
import cn.amos.boot.model.enums.ApplyTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/17
 */
@Getter
@Setter
public class ApplyEntity {
    private Long id;
    /**
     * 订单编号
     */
    private String applyNo;
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 交易金额
     */
    private BigDecimal applyAmt;
    /**
     * 交易时间
     */
    private Date applyTime;
    /**
     * 交易类型
     */
    private ApplyTypeEnum applyType;
    /**
     * 交易状态
     */
    private ApplyStatusEnum applyStatus;
    /**
     * 交易备注
     */
    private String reason;
    /**
     * 交易ip
     */
    private String ip;
    /**
     * 交易城市
     */
    private String city;
    /**
     * 交易地址
     */
    private String location;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
