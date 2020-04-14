package cn.amos.boot.common.base;

import lombok.Getter;
import lombok.Setter;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Getter
@Setter
public class PageModel<S> {

    private Integer page;
    private Integer rows;
    private S search;

    public Integer getLastIndex() {
        return page * rows;
    }

    public Integer getFirstIndex() {
        return (page - 1) * rows;
    }
}
