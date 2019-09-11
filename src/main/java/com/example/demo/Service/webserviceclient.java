package com.example.demo.Service;

import com.example.demo.dao.user_info;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;


public class webserviceclient {

，//通过接口协议获取数据类型
    public static void main(String[] args) throws Exception {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean=new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/service/user?wsdl");
        jaxWsProxyFactoryBean.setServiceClass(UserService.class);

        UserService userService=(UserService)jaxWsProxyFactoryBean.create();
        user_info userResult= userService.getUser("YN20190360");
        System.out.println("===========================================");
        System.out.println("UserName:"+userResult.getUsername());
        System.out.println("===========================================");
        List<user_info> users=userService.getAllUser();
        System.out.println(users);

    }



}
