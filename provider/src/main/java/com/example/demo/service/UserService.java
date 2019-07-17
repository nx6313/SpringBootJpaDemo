package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.utils.ReqException;

import java.util.List;

public interface UserService {
    /**
     * 保存用户信息
     * @param user
     * @return
     * @throws Exception
     */
    User save(User user) throws ReqException;

    /**
     * 删除用户
     * @param id
     * @return
     */
    User delete(Long id);

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    User load(Long id);

    /**
     * 用户列表
     * @return
     */
    List<User> list();

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    User update(User user);
}
