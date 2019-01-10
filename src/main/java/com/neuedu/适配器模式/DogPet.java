package com.neuedu.适配器模式;

public class DogPet implements pet {
    @Override
    public void work(Object obj) {
        if (obj instanceof dog){
            dog d=(dog)obj;
            d.dog();
        }
    }
}
