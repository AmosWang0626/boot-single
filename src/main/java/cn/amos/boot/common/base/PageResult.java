package cn.amos.boot.common.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@Getter
@Setter
public class PageResult<E> implements Serializable {

    private static final long serialVersionUID = 5248311773546420443L;

    /**
     * 总记录数
     */
    private Long total;
    /**
     * 对象列表
     */
    private List<E> rows;

}
