package com.ssmroot.service.impl;

import com.ssmroot.pojo.Feedback;
import com.ssmroot.mapper.FeedbackMapper;
import com.ssmroot.service.IFeedbackService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qlq
 * @since 2019-12-08
 */
@Service
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback> implements IFeedbackService {
	
}
