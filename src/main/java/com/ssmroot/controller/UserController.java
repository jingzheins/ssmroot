package com.ssmroot.controller;

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
    public String userindex(){
	    return "userindex";
    }
}
