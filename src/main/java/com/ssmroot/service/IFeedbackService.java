package com.ssmroot.service;

import com.ssmroot.mapper.FeedbackMapper;
import com.ssmroot.pojo.Feedback;
import com.baomidou.mybatisplus.service.IService;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qlq
 * @since 2019-12-08
 */
public interface IFeedbackService {

    void add(Feedback feedback);

    void del(Feedback feedback);

}
