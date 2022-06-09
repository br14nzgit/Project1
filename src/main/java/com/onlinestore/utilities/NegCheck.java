package com.onlinestore.utilities;

import org.springframework.stereotype.Component;

@Component
public class NegCheck {

    public boolean negcheck(int qoh, int price){
        if(qoh <= 0 || price <= 0){
            return false;
        }
        else {
            return true;
        }
    }
}
