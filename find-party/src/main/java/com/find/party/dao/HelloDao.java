package com.find.party.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.find.party.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {

}
