package org.example;

public class Main3 {
    public static void main(String[] args) {

        hasTeen(1, 20, 1); // თუ ვთქვათ b-ში დავწერთ 20-ს პასუხი გახდება false
    }
    public static void hasTeen(int a, int b, int c) {

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
