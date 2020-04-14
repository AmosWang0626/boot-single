package cn.amos.boot.model.request;

import cn.amos.boot.model.enums.ApplyStatusEnum;
import cn.amos.boot.model.enums.ApplyTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Data
public class ApplyRequest {
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

}
