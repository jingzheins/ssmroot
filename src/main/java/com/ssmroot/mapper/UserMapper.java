package com.ssmroot.mapper;

import com.ssmroot.pojo.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
public interface UserMapper extends BaseMapper<User> {

    public int add(User User);

    public void delete(int id);

    public User get(int id);

    public int update(User User);

    public List<User> list();

    public int count();

}