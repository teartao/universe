package com.tao.business;

import com.tao.entity.po.User;

/**
 * @Author neotao
 * @Date 2018/5/18
 * @Version V0.0.1
 * @Desc
 */
public interface UserService {
    User findUser(User user);

    User createUser(User user);
}