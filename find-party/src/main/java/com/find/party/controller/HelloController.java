package com.find.party.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.find.party.dao.HelloDao;
import com.find.party.entity.Hello;

@RestController
public class HelloController {
	
	@Autowired
	private HelloDao helloDao;

    @GetMapping("/hello")
    public List<Hello> getHello() {
    		return helloDao.findAll();
    }
}
