package cn.amos.boot.common.base;

import cn.amos.boot.common.exception.UserExceptionEnum;
import lombok.Getter;

import java.io.Serializable;
import java.text.MessageFormat;

/**
 * PROJECT: first
 * DATE: 2017/12/31
 *
 * @author DaoyuanWang
 */
@Getter
public class GeneralResponse<T> implements Serializable {
    private static final long serialVersionUID = 1684229805068982996L;

    /**
     * 系统通用返回对象
     */
    public static final GeneralResponse<String> SUCCESS = new GeneralResponse<>(GeneralEnum.SUCCESS);
    public static final GeneralResponse<String> FAIL = new GeneralResponse<>(GeneralEnum.FAIL);
    public static final GeneralResponse<String> PARAM_ERROR = new GeneralResponse<>(GeneralEnum.PARAM_ERROR);
    public static final GeneralResponse<String> OTHER_ERROR = new GeneralResponse<>(GeneralEnum.OTHER_ERROR);

    /**
     * 状态码
     */
    private String code;
    /**
     * 状态码对应信息
     */
    private String msg;
    /**
     * Body
     */
    private T body;

    public GeneralResponse(T body) {
        this(GeneralEnum.SUCCESS, body);
    }

    private GeneralResponse(GeneralEnum iEnum, T body) {
        this.code = iEnum.getCode();
        this.msg = iEnum.getMsg();
        this.body = body;
    }

    public GeneralResponse(UserExceptionEnum iEnum, Object msg) {
        this.code = iEnum.getCode();
        this.msg = MessageFormat.format(iEnum.getMsg(), msg);
    }

    public GeneralResponse(IEnum iEnum) {
        this.code = iEnum.getCode();
        this.msg = iEnum.getMsg();
    }

    public GeneralResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 处理泛型类型不一致的异常
     *
     * @param response 原始 GenericResponse<F>
     * @param <T>      返回 response 的类型
     * @param <F>      入参 response 的类型
     * @return GenericResponse<T>
     */
    public static <T, F> GeneralResponse<T> format(GeneralResponse<F> response) {
        return new GeneralResponse<>(response.getCode(), response.getMsg());
    }

    public boolean success() {
        return GeneralEnum.SUCCESS.getCode().equals(getCode());
    }

}
