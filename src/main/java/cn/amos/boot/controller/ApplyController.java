package cn.amos.boot.controller;

import cn.amos.boot.dao.entity.ApplyEntity;
import cn.amos.boot.dao.mappers.ApplyMapper;
import cn.amos.boot.request.PageModel;
import cn.amos.boot.response.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

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
        PageModel pageModel = new PageModel();
        pageModel.setPage(page);
        pageModel.setRows(size);
        List<ApplyEntity> applyEntities = applyMapper.selectByPage(pageModel);
        List<ApplyEntity> applyEntitiesAll = applyMapper.selectAll();
        PageResult<ApplyEntity> pageResult = new PageResult<>();
        pageResult.setPage(page);
        pageResult.setSize(size);
        // 总记录数量
        pageResult.setTotal(applyEntitiesAll.size());
        // 当前页记录数量
        pageResult.setNumber(applyEntities.size());
        // 记录数据列表
        pageResult.setRows(applyEntities);
        // 第一个 || 最后一个
        pageResult.setTotalPages();
        pageResult.setFirst();
        pageResult.setLast();

        model.addAttribute("pageResult", pageResult);
        return "apply";
    }
}
