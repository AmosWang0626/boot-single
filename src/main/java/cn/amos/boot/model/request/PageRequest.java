package cn.amos.boot.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Data
public class PageRequest implements Serializable {
    private static final long serialVersionUID = -2202227226880418869L;

    /**
     * 查询条件: 开始时间 YYYY-MM-DD
     */
    private String startTime;
    /**
     * 查询条件: 结束时间 YYYY-MM-DD
     */
    private String endTime;
    /**
     * 查询条件: 订单编号
     */
    private String applyNo;
    /**
     * 查询条件: 手机号
     */
    private String phoneNo;

    /**
     * 分页相关: 页码
     */
    private Integer page;
    /**
     * 分页相关: 当页显示数量
     */
    private Integer size;
}
