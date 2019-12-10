package com.ssmroot.service.impl;

import com.ssmroot.pojo.Feedback;
import com.ssmroot.mapper.FeedbackMapper;
import com.ssmroot.service.IFeedbackService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssmroot.service.MyBaseMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qlq
 * @since 2019-12-08
 */
@Service
public class FeedbackServiceImpl implements IFeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;


    @Override
    public void add(Feedback feedback) {
        feedbackMapper.insert(feedback);
    }

    @Override
    public void del(Feedback feedback) {
        feedbackMapper.delete(feedback);
    }

}
