package com.ssmroot.service.impl;

import com.ssmroot.pojo.Log;
import com.ssmroot.mapper.LogMapper;
import com.ssmroot.service.ILogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
@Service
public class LogServiceImpl implements ILogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public void add(Log log) {
        logMapper.insert(log);
    }
}
