package cn.amos.boot.web.controller;

import cn.amos.boot.common.base.BootstrapPageResult;
import cn.amos.boot.common.base.PageModel;
import cn.amos.boot.common.base.PageResult;
import cn.amos.boot.dao.entity.ApplyEntity;
import cn.amos.boot.dao.mappers.ApplyMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author DaoyuanWang
 * @version V1.0.0
 * @apiNote 用户相关
 * @date 2018/1/15
 */
@Controller
@RequestMapping("apply")
public class ApplyController {

    @Resource
    private ApplyMapper applyMapper;

    @RequestMapping("page")
    public String pageApply(@RequestParam(value = "page", required = false) Integer page,
                            @RequestParam(value = "size", required = false) Integer size,
                            Model model) {
        if (page == null || size == null) {
            return "parameterError";
        }
        PageModel<String> pageModel = new PageModel<>();
        pageModel.setPage(page);
        pageModel.setRows(size);

        PageResult<ApplyEntity> pageResult = applyMapper.defaultFindByPage(pageModel);

        model.addAttribute("pageResult", new BootstrapPageResult<>(page, size, pageResult));

        return "apply";
    }
}
