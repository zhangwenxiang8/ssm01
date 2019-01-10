package com.neuedu.适配器模式;

public class Imlpet适配器 implements pet {
    @Override
    public void work(Object obj) {
        if (obj instanceof cat){
            cat c=(cat) obj;
            c.cat();
        }

        if (obj instanceof dog){
            dog d=(dog)obj;
            d.dog();
        }
    }
}
