package com.atcoder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class OddEvenCheckTest {
    @Test
    @DisplayName("正常な入力テスト(偶数)")
    public void testEvenInput() {
        String input = "1 2";
        // テストデータを入力ストリームに変換
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        String result = OddEvenCheck.processInput(scanner);

        assertEquals("Even", result);
    }

    @Test
    @DisplayName("正常な入力テスト(奇数)")
    public void testOddInput() {
        String input = "1 5";
        // テストデータを入力ストリームに変換
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        String result = OddEvenCheck.processInput(scanner);

        assertEquals("Odd", result);
    }

    @Test
    @DisplayName("正常な入力テスト(奇数 2つより多い)")
    public void testOddMoreThanTwoInput() {
        String input = "1 5 7";
        // テストデータを入力ストリームに変換
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        String result = OddEvenCheck.processInput(scanner);

        assertEquals("Odd", result);
    }

    @Test
    @DisplayName("境界値")
    public void test() {
        String input = "1 1000";
        // テストデータを入力ストリームに変換
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        String result = OddEvenCheck.processInput(scanner);

        assertEquals("Even", result);
    }
}
