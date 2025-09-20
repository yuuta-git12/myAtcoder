package com.atcoder;

import java.util.*;

/**
 * 数字の各桁に0以外が含まれている個数を数えるプログラムです。
 * 入力として1桁以上の数字を受け取り、0以外の値の総数を出力します。
 * @version 1.0
 */
public class PlacingMarbles {
    /**
     * メインメソッド
     * 標準入力から1桁以上の数字を読み取り、各桁に0以外の値が含まれている個数を出力します。
     * 
     * @param args コマンドライン引数（使用されません）
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = processInput(sc);
        System.out.println(result);
        sc.close();
    }

    /**
     * 入力された数字の各桁に0以外の値が含まれている個数を数えます。
     * 数字を10進数で各桁に分解し、各桁が1である場合をカウントします。
     * 
     * @param sc 入力スキャナー
     * @return 各桁に1が含まれている個数。入力が整数でない場合は-1を返します。
     * 
     * @example
     * 入力: 101 → 出力: 2 (1桁目と3桁目が1)
     * 入力: 111 → 出力: 3 (全ての桁が1)
     * 入力: 000 → 出力: 0 (0のみ)
     */
    public static int processInput(Scanner sc){
        final int DECIMAL_RADIX = 10;   // 基数の定義
        int count_has_num = 0;
        int num_mod = 0;    // 余り

        if(sc.hasNextInt()){
            int num = sc.nextInt();

            while(num != 0){
                num_mod = num % DECIMAL_RADIX;
                num = num / DECIMAL_RADIX;
                if(num_mod != 0){   // 余りがある場合はカウントアップ
                    count_has_num++;
                }
            }
        }else{
            return -1;
        }
        return count_has_num;
    }
}
