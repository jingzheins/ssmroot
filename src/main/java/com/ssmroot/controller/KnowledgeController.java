package com.ssmroot.controller;

import com.ssmroot.service.IKnowledgeService;
import com.ssmroot.util.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
@Controller
@RequestMapping("/knowledge")
public class KnowledgeController {

    @Autowired
    IKnowledgeService iKnowledgeService;

    @ResponseBody
    @RequestMapping(value = "matchProblem")
    public String matchProblem(String msg){
        Map<String,Object> map = iKnowledgeService.matchProblem(msg);
        if(map==null) {
            return "";
        }else {
            return map.get("answer").toString();
        }
    }
}
