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
        boolean foundNonInteger = false;
        boolean hasInt = false;
        while(sc.hasNext()){
            if(!sc.hasNextInt()){foundNonInteger = true; break;}
            int num = sc.nextInt();
            if(num % 2 == 0) return "Even";
            hasInt = true;
        }
        return foundNonInteger ? "数値型以外の値が入れられたので判定を中止します。" : (hasInt ? "Odd": "Odd");
    }
}
