package cn.amos.boot.util;

import java.util.Date;

/**
 * PROJECT: property
 * DATE: 2017/11/20
 *
 * @author DaoyuanWang
 */
public class GenericIdUtil {

    /**
     * 生成18位会员编号
     */
    public static Long genericUserId() {
        StringBuffer sb = new StringBuffer();
        sb.append(DateUtil.format(new Date(), DateUtil.MINUTE_DATE_PATTERN));
        sb.append(RandomUtil.generateLuckyNumberString(6));

        return Long.valueOf(sb.toString());
    }

    /**
     * 生成20位订单编号
     */
    public static Long genericApplyNo() {
        StringBuffer sb = new StringBuffer();
        sb.append(DateUtil.format(new Date(), DateUtil.SECOND_DATE_PATTERN));
        sb.append(RandomUtil.generateUpperString(6));

        return Long.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(genericUserId());
    }
}
