package com.atcoder;

import java.util.*;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = processInput(sc);
        System.out.println(result);
        sc.close();
    }

    public static String processInput(Scanner sc){
        int num_product = 1;
        String result = "";
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                num_product *= num;
            }else{
                continue;
            }
        }

        if(num_product % 2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }
        
        return result;
    }
}
