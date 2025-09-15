package com.atcoder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class PracticeATest {

    @Test
    @DisplayName("整数と文字列の正常な入力テスト")
    public void testNormalInput() {
        // テストデータ: "1 2 3 hello"
        String input = "1 2 3 hello";
        // テストデータを入力ストリームに変換 new Scanner(System.in)と同様の処理にするため、ByteArrayInputStreamを使用
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);   //入力ストリームをScannerに変換
        
        String result = PracticeA.processInput(scanner);   //テストデータを処理
        
        assertEquals("6 hello", result);   //期待される結果と実際の結果を比較
    }

    @Test
    @DisplayName("数値のみの入力テスト")
    public void testNumbersOnly() {
        // テストデータ: "10 20 30"
        String input = "10 20 30";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        String result = PracticeA.processInput(scanner);
        
        assertEquals("60 ", result);
    }

    @Test
    @DisplayName("文字列のみの入力テスト")
    public void testStringOnly() {
        // テストデータ: "world"
        String input = "world";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        String result = PracticeA.processInput(scanner);
        
        assertEquals("0 world", result);
    }

    @Test
    @DisplayName("空の入力テスト")
    public void testEmptyInput() {
        // テストデータ: ""
        String input = "";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        String result = PracticeA.processInput(scanner);
        
        assertEquals("0 ", result);
    }

    @Test
    @DisplayName("負の数を含む入力テスト")
    public void testNegativeNumbers() {
        // テストデータ: "-5 10 -3 test"
        String input = "-5 10 -3 test";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        String result = PracticeA.processInput(scanner);
        
        assertEquals("2 test", result);
    }

    @Test
    @DisplayName("複数の文字列がある場合のテスト（最後の文字列が使用される）")
    public void testMultipleStrings() {
        // テストデータ: "1 hello 2 world 3"
        String input = "1 hello 2 world 3";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        String result = PracticeA.processInput(scanner);
        
        assertEquals("6 world", result);
    }

    @Test
    @DisplayName("大きな数値のテスト")
    public void testLargeNumbers() {
        // テストデータ: "1000000 2000000 3000000 large"
        String input = "1000000 2000000 3000000 large";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        String result = PracticeA.processInput(scanner);
        
        assertEquals("6000000 large", result);
    }

    @Test
    @DisplayName("ゼロを含む入力テスト")
    public void testWithZero() {
        // テストデータ: "0 5 0 zero"
        String input = "0 5 0 zero";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        
        String result = PracticeA.processInput(scanner);
        
        assertEquals("5 zero", result);
    }
}
