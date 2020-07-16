package com.simpletester.mockserver;

import lombok.Getter;
import lombok.Setter;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ComponentScan
@RestController
public class OrderController {

    @PostMapping("/order/getOrderInfo")
    public Object addUser(){
        List<User> userList= getUserData();
        return userList;
    }

    private List<User>   getUserData(){
        List<User> userList= new ArrayList<User>();
        return getUsers(userList);
    }

    private List<User> getUsers(List<User> userList) {
        userList.add(new User("Bill","Gates"));
        userList.add(new User("George","Bush"));
        userList.add(new User("Thomas","Carter"));
        userList.add(new User("张","三"));
        userList.add(new User("赵","云"));
        return userList;
    }

}


