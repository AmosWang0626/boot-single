package cn.amos.boot.service;

import cn.amos.boot.common.base.GeneralResponse;
import cn.amos.boot.model.request.ApplyRequest;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public interface ApplyService {

    /**
     * 生成会员编号
     *
     * @param applyRequest 用户id
     * @return 通用
     */
    GeneralResponse<String> generateApply(ApplyRequest applyRequest);
}
