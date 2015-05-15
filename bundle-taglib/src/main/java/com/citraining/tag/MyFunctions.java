package com.citraining.tag;

import tldgen.Function;

public class MyFunctions {
    
    @Function
    public static String reverse(String string){
        return new StringBuilder(string).reverse().toString();
    }
    
}
