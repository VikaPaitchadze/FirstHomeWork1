package org.example;

public class While {
    public static void main(String[] args) {
        String text = "winadadeba  z-ze";

        int i = 2; //რადგან 0-დან ვიწყებთ ათვლას 0,1,2 მესამე სიმბოლო 2

        while (i < text.length()) {
            char ch = text.charAt(i);
            System.out.print(ch);

            if (ch == 'z') {
                break;
            }
            i += 3;
        }
    }
}