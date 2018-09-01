package smile.wangsy.january.member.controller;

import smile.wangsy.january.member.model.Member;
import smile.wangsy.january.member.dto.MemberDto;
import smile.wangsy.january.member.vo.MemberVo;
import smile.wangsy.january.member.valid.MemberValid;
import smile.wangsy.january.member.service.MemberService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/09/01
 */
@RestController
@RequestMapping("/v1/member")
@Api(value = "MemberController", description = "會員管理")
public class MemberController {

    @Autowired
    private MemberService services;

    @PostMapping
    @ApiOperation(value = "新增", httpMethod = "POST", response = MemberController.class, notes = "新增")
    public BaseResult createModel(MemberDto dto) {
        try {
            services.insertByDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "新增数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @PutMapping
    @ApiOperation(value = "修改", httpMethod = "PUT", response = MemberController.class, notes = "修改")
    public BaseResult updateModel(MemberDto dto) {
        try {
            services.updateByDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "修改数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除", httpMethod = "DELETE", response = MemberController.class, notes = "删除")
    public BaseResult deleteById(@PathVariable Long id) {
        if(id == null || id <= 0) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        try {
            services.deleteByUpdate(id);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "删除数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询", httpMethod = "GET", response = MemberController.class, notes = "根据id查询")
    public BaseResult getById(@PathVariable Long id) {
        if(id == null || id <= 0) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        Member model = services.selectById(id);

        MemberVo modelVo = MemberVo.transModelToVo(model);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, modelVo);
    }

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    @GetMapping
    @ApiOperation(value = "根据condition查询", httpMethod = "GET", response = MemberController.class, notes = "根据条件查询")
    public BaseResult getByCondition(MemberValid valid) {
        if(null == valid) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        List<Member> list = services.selectByConditions(valid);

        List<MemberVo> voList = MemberVo.transModelListToVoList(list);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, voList);
    }
}
