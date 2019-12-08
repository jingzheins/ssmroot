package com.ssmroot.service;

import com.ssmroot.pojo.Knowledge;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
public interface IKnowledgeService extends IService<Knowledge> {

    //返回null或者一条语句
    public Map<String,Object> matchProblem(String msg);



}
