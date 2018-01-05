package com.mk.tracrat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.tracrat.command.Command;
import com.mk.tracrat.service.UserService;

@RestController
@RequestMapping("/mk")
public class UserController {
@Autowired
private UserService service;
@PostMapping("/insert")
public ResponseEntity<Command> userInsert(@RequestBody Command cmd){
	String res=service.userInsert(cmd);
	return new ResponseEntity<Command>(cmd,HttpStatus.CREATED);
}
}
