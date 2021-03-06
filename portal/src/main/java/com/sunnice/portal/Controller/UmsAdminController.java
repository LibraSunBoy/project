package com.sunnice.portal.Controller;

import com.sunnice.generator.assist.CommonResult;
import com.sunnice.generator.entity.UmsAdmin;
import com.sunnice.portal.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: JYD
 * @Date: 2019/4/26 17:20
 */
@Api(tags = "UmsAdminController",description = "后台用户管理")
@Controller
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService adminService;

    @ApiOperation("后台用户列表查询")
    @RequestMapping(value = "/queryList",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum" ,value = "页码（默认第一页）",defaultValue = "1",dataType = "String",paramType = "query",required = false),
            @ApiImplicitParam(name = "pageSize",value = "数量（默认每页10条）",defaultValue = "10",dataType = "String",paramType = "query",required = false)
    })
    @ResponseBody
    public Object queryList(Integer pageNum,Integer pageSize){
        List<UmsAdmin> umsAdmins = adminService.queryList(pageNum, pageSize);
        return new CommonResult().pageSuccess(umsAdmins);
    }

    @ApiOperation("后台用户密码重置")
    @RequestMapping(value = "/resetPassword",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId" ,value = "用户id",dataType = "String",paramType = "query",required = true),
    })
    @ResponseBody
    public Object resetPassword(Long adminId){
        int count = adminService.resetPassword(adminId);
        if (count>0){
            return new CommonResult().success();
        }
        return new CommonResult().failed();
    }
}
