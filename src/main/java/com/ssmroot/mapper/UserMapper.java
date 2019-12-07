package com.ssmroot.mapper;

import com.ssmroot.pojo.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
public interface UserMapper extends BaseMapper<User> {

    int userInsert(User user);

}