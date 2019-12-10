package com.ssmroot.controller;

import com.ssmroot.pojo.Log;
import com.ssmroot.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
@Controller
@RequestMapping("/log")
public class LogController {

    @Autowired
    ILogService iLogService;

    @RequestMapping(value = "add")
    public String add(Log log){
        iLogService.add(log);
        return "1";
    }
	
}
