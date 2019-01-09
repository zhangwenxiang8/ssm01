package com.neuedu.pojo;

import lombok.Data;

@Data
public class Dept {
    private  String pname;
    public Dept(){
        System.out.println("dept 构造方法");
    }

        public String demo(){
        return "abcd";
        }

}
