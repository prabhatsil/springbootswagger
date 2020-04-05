package com.poc.springbootswagger.controller;

import com.poc.springbootswagger.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserResource {

    @GetMapping
    @ApiOperation(
            value = "List all users available", response = List.class)
    public List<User> getUsers(){
        return Arrays.asList(
                new User("John Doe",3000),
                new User("Sambit Patra",4000)
        );
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable("name") String userName){
        return new User(userName, 500);
    }

}
