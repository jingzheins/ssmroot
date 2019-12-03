package com.ssmroot.service.impl;

import com.ssmroot.pojo.User;
import com.ssmroot.mapper.UserMapper;
import com.ssmroot.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
