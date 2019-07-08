package com.example.demo.Controller;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private UserRepository userrepository;
    @RequestMapping(value="/hello")
    public List<User> getUserList(){
        return userrepository.findAll();
    }
}
