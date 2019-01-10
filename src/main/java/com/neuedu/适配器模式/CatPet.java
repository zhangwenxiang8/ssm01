package com.neuedu.适配器模式;

import java.sql.Driver;

public class CatPet implements pet {
    @Override
    public void work(Object obj) {
        if (obj instanceof cat){
            cat cat = (cat) obj;
            cat.cat();
        }
    }
}
