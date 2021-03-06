package com.ssmroot.service;

import com.ssmroot.pojo.User;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
@Repository
public interface IUserService {

    int insertUser(User user);

    List<User> list();

}
