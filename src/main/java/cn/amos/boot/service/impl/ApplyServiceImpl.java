package cn.amos.boot.service.impl;

import cn.amos.boot.common.base.GeneralResponse;
import cn.amos.boot.common.util.GenericIdUtil;
import cn.amos.boot.common.util.IpUtil;
import cn.amos.boot.dao.entity.ApplyEntity;
import cn.amos.boot.dao.mappers.ApplyMapper;
import cn.amos.boot.model.dto.TaoBaoLocationDTO;
import cn.amos.boot.model.request.ApplyRequest;
import cn.amos.boot.service.ApplyService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Component("applyService")
public class ApplyServiceImpl implements ApplyService {
    @Resource
    private ApplyMapper applyMapper;

    @Override
    public GeneralResponse<String> generateApply(ApplyRequest applyRequest) {
        String ip = applyRequest.getIp();
        if (StringUtils.isBlank(ip) || applyRequest.getApplyAmt() == null
                || StringUtils.isBlank(applyRequest.getUserId())) {
            return GeneralResponse.PARAM_ERROR;
        }
        ApplyEntity applyEntity = new ApplyEntity();
        applyEntity.setUserId(applyRequest.getUserId());
        applyEntity.setApplyAmt(applyRequest.getApplyAmt());
        applyEntity.setApplyTime(applyRequest.getApplyTime());
        applyEntity.setApplyType(applyRequest.getApplyType());
        applyEntity.setApplyStatus(applyRequest.getApplyStatus());
        applyEntity.setReason(applyRequest.getReason());
        applyEntity.setIp(ip);

        applyEntity.setApplyNo(GenericIdUtil.genericApplyNo());
        GeneralResponse<TaoBaoLocationDTO> locationByTaoBao = IpUtil.getLocationByTaoBao(ip);
        if (locationByTaoBao.success()) {
            TaoBaoLocationDTO locationDTO = locationByTaoBao.getBody();
            applyEntity.setCity(locationDTO.getCity());
            applyEntity.setLocation(locationDTO.getArea() + locationDTO.getRegion() + locationDTO.getCity());
        }
        applyEntity.setCreateTime(new Date());

        applyMapper.insertApplyEntity(applyEntity);
        return GeneralResponse.SUCCESS;
    }
}
