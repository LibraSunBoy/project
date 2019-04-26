//package com.sunnice.portal.Controller;
//
//import com.sunnice.generator.assist.CommonResult;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
///**
// * @Author: JYD
// * @Date: 2019/4/26 12:12
// */
//@Api(tags = "PmsSkuController",description = "商品属性管理")
//@Controller
//@RequestMapping("/sku")
//public class PmsSkuController {
//    @Autowired
//    private PmsSkuService skuService;
//
//    @ApiOperation("列表查询")
//    @RequestMapping(value = "/queryList",method = RequestMethod.POST)
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "pageNum" ,value = "页码（默认第一页）",defaultValue = "1",dataType = "String",paramType = "query",required = false),
//            @ApiImplicitParam(name = "pageSize",value = "数量（默认每页10条）",defaultValue = "10",dataType = "String",paramType = "query",required = false)
//    })
//    @ResponseBody
//    public Object queryList(Integer pageNum,Integer pageSize){
//        List<PmsSkuStock> pmsSkuStocks = skuService.queryList(pageNum, pageSize);
//        return new CommonResult().pageSuccess(pmsSkuStocks);
//    }
//}
