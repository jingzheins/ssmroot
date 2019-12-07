package com.ssmroot.controller;

import com.ssmroot.pojo.User;
import com.ssmroot.service.IUserService;
import com.ssmroot.util.ResultVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

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

    @Autowired
    IUserService iUserService;

	@ResponseBody
    @RequestMapping(value = "userindex")
    @ApiOperation(value = "返回Map对象")
    @ApiImplicitParam(name = "value",value = "给我值就返回给你",required = true)
    public String userindex(){
	    return "userindex";
    }

    @ResponseBody
    @RequestMapping(value = "insertUser")
    public ResultVO inserUser(){
        User user = new User();
        user.setCreatetime(new Date());
        user.setUsersession("12345");
        user.setUsername("惊蛰");
        new ResultVO(iUserService.insertUser(user));
        return new ResultVO("success");
    }

}
