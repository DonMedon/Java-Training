package org.example.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word;

        System.out.println("Insere uma palavra:");
        word = input.next();

        if (StringUtils.isPalindrome(word)) {
            System.out.println("É palindrome");
        } else {
            System.out.println("Não é");
        }
    }
}