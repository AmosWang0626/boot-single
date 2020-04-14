package cn.amos.boot.model.dto;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaiDuLocationErrorDTO implements Serializable {
    private static final long serialVersionUID = 3570274274892943585L;
    /**
     * 错误代码
     */
    @JsonProperty("error_code")
    private String errorCode;
    /**
     * 错误信息
     */
    @JsonProperty("error_msg")
    private String errorMsg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
