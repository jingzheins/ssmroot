package com.ssmroot.controller;

import com.ssmroot.pojo.Feedback;
import com.ssmroot.service.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qlq
 * @since 2019-12-08
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    IFeedbackService iFeedbackService;

	@ResponseBody
    @RequestMapping(value = "add")
    public String add(Feedback feedback){
	    iFeedbackService.add(feedback);
	    return "系统已经接收到您的反馈，谢谢！！！";
    }



}
