package com.leeyangy.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by leeyangy on 2021/7/2 0:20
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
