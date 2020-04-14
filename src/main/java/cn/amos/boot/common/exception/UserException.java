package cn.amos.boot.common.exception;

/**
 * PROJECT: first
 * DATE: 2017/12/31
 *
 * @author DaoyuanWang
 */
public class UserException extends RuntimeException {

    private static final long serialVersionUID = -1038130369512449415L;

    public UserException(String msg) {
        super(msg);
    }

}
