package com.example.TfgSoftAlba.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TfgSoftAlba.models.entity.news;

@Repository
public interface NewRepository extends JpaRepository<news,Long> {
}
