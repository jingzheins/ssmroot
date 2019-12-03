package com.ssmroot.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody
    @RequestMapping(value = "userindex")
    @ApiOperation(value = "返回Map对象")
    @ApiImplicitParam(name = "value",value = "给我值就返回给你",required = true)
    public String userindex(){
	    return "userindex";
    }
}
