package com.youda.anchor.api.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @PostMapping(value = "/register")
    @ApiOperation(value = "", notes = "")
    public void register() {

    }

    public void login() {

    }

    
}
