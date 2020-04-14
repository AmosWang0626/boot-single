package cn.amos.boot.common.base;

import java.util.List;

/**
 * 模块名称: boot-single
 * 模块描述: 通用分页对象
 *
 * @author amos.wang
 * @date 2020/4/14 10:35
 */
public interface IPageMapper<E, S> {

    /**
     * 默认分页查询
     *
     * @param pageModel PageModel
     * @return PageResult
     */
    default PageResult<E> defaultFindByPage(PageModel<S> pageModel) {
        List<E> applyEntities = selectByPage(pageModel);
        Long total = selectTotal(pageModel);

        PageResult<E> pageResult = new PageResult<>();
        pageResult.setTotal(total);
        pageResult.setRows(applyEntities);

        return pageResult;
    }

    /**
     * 根据条件查询出总记录数
     *
     * @param pageModel PageModel
     * @return 总记录数
     */
    Long selectTotal(PageModel<S> pageModel);

    /**
     * 根据条件查询出分页数据
     *
     * @param pageModel PageModel
     * @return 分页数据
     */
    List<E> selectByPage(PageModel<S> pageModel);

}
