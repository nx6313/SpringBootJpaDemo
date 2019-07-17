package com.example.demo.service.impl;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.utils.ReqException;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) throws ReqException {
        user = userRepository.save(user);
        return user;
    }

    @Override
    public User delete(Long id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
        return user;
    }

    @Override
    public User load(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        userRepository.save(user);
        return user;
    }
}
