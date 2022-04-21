package com.demo.service.impl;


import org.springframework.stereotype.Service;

/**
 * @author wzy
 * @date 2022/4/21 14:26
 */
public class DatabaseSearch implements Search {
    @Override
    public void search() {
        System.out.println("DatabaseSearch已被注册到ioc中实例化");
    }
}
