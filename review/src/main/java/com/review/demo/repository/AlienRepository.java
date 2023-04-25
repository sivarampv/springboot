package com.review.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.demo.model.Alien;

@Repository

public interface AlienRepository extends JpaRepository<Alien,Integer>{

}
