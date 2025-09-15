package com.atcoder;

import java.util.*;

public class PracticeA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = processInput(sc);
        System.out.println(result);
        sc.close();
    }
    
    public static String processInput(Scanner sc) {
        int num_sum = 0;
        String str = "";
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                num_sum += num;
            }else{
                str = sc.next();
            }
        }
        return num_sum + " " + str;
    }
}

