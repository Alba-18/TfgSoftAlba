package com.example.TfgSoftAlba.models.service;

import com.example.TfgSoftAlba.models.entity.User;
import com.example.TfgSoftAlba.models.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userrepository;

    @Override
    public List<User> listAllUsers() {
        return userrepository.findAll();
    }
}
