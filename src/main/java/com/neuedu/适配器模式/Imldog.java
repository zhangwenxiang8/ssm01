package com.neuedu.适配器模式;

import javax.annotation.Resource;

public class Imldog implements dog {

    @Override
    public void dog() {
        System.out.println("eat bone");
    }
}
