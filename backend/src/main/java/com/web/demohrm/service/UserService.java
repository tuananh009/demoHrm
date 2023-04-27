package com.web.demohrm.service;

import com.web.demohrm.model.User;
import com.web.demohrm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listUser(){
        return userRepository.findAll();
    }
}
