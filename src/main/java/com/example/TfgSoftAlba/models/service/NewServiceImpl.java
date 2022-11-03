package com.example.TfgSoftAlba.models.service;

import com.example.TfgSoftAlba.models.entity.news;
import com.example.TfgSoftAlba.models.repository.NewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements NewService{

    @Autowired
    private NewRepository repository;

    @Override
    public List<news> listAllNews() {
        return repository.findAll();
    }
}
