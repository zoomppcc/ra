package com.example.demo.Controller;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;
import com.example.demo.server.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hells")
@Service
public class CustomerController {
    @Autowired
    private UserRepository userrepository;
    /*private HttpClient http;
    public String value(){
        String url = "http://localhost:8080/a=zhangsan";
        HttpMethod method = HttpMethod.GET;
        MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
        return http.client(url,method,params);
    }*/
    @RequestMapping(value="/hello")
    public List<User> getUserList(){
        /*CustomerController ct = new CustomerController();
        String s = ct.value();*/
        return userrepository.findAll();
    }


}
