package com.simpletester.controller;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@ComponentScan
@RestController
public class UserController {

    @GetMapping("/uc/getUserInfo")
    public String getJson(){

        //获取当前客户端对象
        HttpClient httpClient = HttpClientBuilder.create().build();

        //设定url(这个url大家可以根据自己要调用的api填写)
        String url = "";
        //token是某查分配的
        String token = "";

        //通过url获取请求(get请求)
        HttpGet httpGet = new HttpGet(url);
        //设定请求头
        httpGet.setHeader("Authorization",token);
        String json = null;
        try {
            //通过请求对象获取响应对象
            HttpResponse response = httpClient.execute(httpGet);
            //判断网络状态码是否正常
            if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                json = EntityUtils.toString(response.getEntity(),"utf-8");
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpGet.abort();
        }
        return json;
    }
}
