package com.leeyangy.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * Created by leeyangy on 2021/7/2 23:54
 */
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
    }
}
