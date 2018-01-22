package cn.amos.boot;

import cn.amos.boot.dto.TaoBaoLocationDTO;
import cn.amos.boot.enums.ApplyStatusEnum;
import cn.amos.boot.enums.ApplyTypeEnum;
import cn.amos.boot.enums.AreaTestEnum;
import cn.amos.boot.request.ApplyRequest;
import cn.amos.boot.request.UserRequest;
import cn.amos.boot.response.GeneralResponse;
import cn.amos.boot.service.ApplyService;
import cn.amos.boot.service.UserService;
import cn.amos.boot.util.IpUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootSingleApplicationTests {
    @Resource
    private ApplyService applyService;
    @Resource
    private UserService userService;

    @Test
    public void applyGenerate() {
        for (int i = 10, len = 60; i < len; i++) {
            ApplyRequest applyRequest = new ApplyRequest();
            applyRequest.setUserId("20180118U4568" + i);
            applyRequest.setApplyAmt(new BigDecimal("5" + i));
            applyRequest.setApplyStatus(ApplyStatusEnum.REPAYING);
            applyRequest.setApplyType(ApplyTypeEnum.PROPERTY);
            applyRequest.setApplyTime(new Date());
            applyRequest.setIp("115.63.163.155");
            applyRequest.setReason("666666");
            applyService.generateApply(applyRequest);
        }
    }

    @Test
    public void userGenerate() {
        for (int i = 10, len = 60; i < len; i++) {
            UserRequest userRequest = new UserRequest();
            userRequest.setName("hello" + i);
            userRequest.setAge(10 + i);
            userRequest.setPhoneNo("189123412" + i);
            userRequest.setIdentityNo("4113811926021856" + i);
            userRequest.setAddress("上海市虹口区武进路" + i + "号");
            userService.generateUser(userRequest);
        }
    }

    @Test
    public void testIp() {
        for (AreaTestEnum areaTestEnum : AreaTestEnum.values()) {
            GeneralResponse<TaoBaoLocationDTO> locationByTaoBao = IpUtil.getLocationByTaoBao(areaTestEnum.getIp());
            if (locationByTaoBao.success()) {
                if (areaTestEnum.getCity().equals(locationByTaoBao.getBody().getCity())) {
                    System.out.println("啦啦啦---------------------" + areaTestEnum + "-------------------");
                }
            }
        }
    }

    @Test
    public void testOneIp() {
        AreaTestEnum areaTestEnum = AreaTestEnum.AREA49;
        GeneralResponse<TaoBaoLocationDTO> locationByTaoBao = IpUtil.getLocationByTaoBao(areaTestEnum.getIp());
        if (locationByTaoBao.success()) {
            if (areaTestEnum.getCity().contains(locationByTaoBao.getBody().getCity())) {
                System.out.println("啦啦啦---------------------" + areaTestEnum + "-------------------");
            }
        }
        /*GeneralResponse<BaiDuLocationDTO> locationByBaiDu = IpUtil.getLocationByBaiDu(areaTestEnum.getIp());
        if (locationByBaiDu.success()) {
            if (areaTestEnum.getCity().contains(locationByBaiDu.getBody().getCity())) {
                System.out.println("啦啦啦---------------------" + areaTestEnum + "-------------------");
            }
        }*/
    }

}
