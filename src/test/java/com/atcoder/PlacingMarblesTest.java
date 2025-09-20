package com.atcoder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlacingMarblesTest {

    @Test
    @DisplayName("正常な入力テスト(000)")
    void processInput_000() {
        String input = "000";
        // テストデータを入力ストリームに変換
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        int result = PlacingMarbles.processInput(scanner);

        assertEquals(0,result,"成功");
    }

    @Test
    @DisplayName("正常な入力テスト(101)")
    void processInput_101() {
        String input = "101";
        // テストデータを入力ストリームに変換
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        int result = PlacingMarbles.processInput(scanner);

        assertEquals(2,result,"成功");
    }

    @Test
    @DisplayName("異常な入力テスト(aaa)")
    void processInput_aaa() {
        String input = "aaa";
        // テストデータを入力ストリームに変換
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        int result = PlacingMarbles.processInput(scanner);

        assertEquals(-1,result,"成功");
    }
}