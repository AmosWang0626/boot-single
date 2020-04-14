package cn.amos.boot.model.dto;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Getter
@Setter
public class BaiduLocationDTO implements Serializable {
    private static final long serialVersionUID = 1115816313136321458L;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}