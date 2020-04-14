package cn.amos.boot.common.base;

import lombok.Getter;
import lombok.Setter;

/**
 * 模块名称: boot-single
 * 模块描述: Bootstrap 分页拓展
 *
 * @author amos.wang
 * @date 2020/4/14 11:16
 */
@Getter
@Setter
public class BootstrapPageResult<E> extends PageResult<E> {
    /**
     * 当前是第几页
     */
    private int page;
    /**
     * 每页记录数
     */
    private int size;
    /**
     * 当前页记录数
     */
    private int number;
    /**
     * 总页数
     */
    private int totalPages;
    /**
     * 是否第一页
     */
    private boolean first;
    /**
     * 是否最后一页
     */
    private boolean last;

    public BootstrapPageResult(int page, int size, PageResult<E> pageResult) {
        this.page = page;
        this.size = size;

        // init data
        setRows(pageResult.getRows());
        setTotal(pageResult.getTotal());

        // bootstrap param
        setTotalPages();
        setFirst();
        setLast();
    }

    public void setFirst() {
        this.first = (page == 1);
    }

    public void setLast() {
        this.last = (page == getTotalPages());
    }

    public void setTotalPages() {
        int basePage = (int) (getTotal() / size);
        int surplus = (int) (getTotal() % size);
        this.totalPages = (surplus > 0 ? basePage + 1 : basePage);
        // totalPages 默认为1
        if (totalPages < 1) {
            this.totalPages = 1;
        }
    }

}
