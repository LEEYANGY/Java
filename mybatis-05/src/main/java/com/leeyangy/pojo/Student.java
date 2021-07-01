package com.leeyangy.pojo;

import lombok.Data;

/**
 * Created by leeyangy on 2021/7/1 13:19
 */
@Data
public class Student {
    private int id;
    private String name;

//    学生需要关联一个老师
    private Teacher teacher;

}
