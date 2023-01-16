package org.example;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Calculator {
    int sum(int ... values) {
        System.out.println(" int");
        int result = 0;
        for(int i : values){
            result = result + i;
        }
        return result;
    }
    float sum (float... values){
        System.out.println(" float");
            float result = 0f;
            for(float i : values){
                result = result + i;
            }
            return result;

    }

}
