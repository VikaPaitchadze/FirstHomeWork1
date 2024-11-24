package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,4,5};
        int count = 0;
        int i =0;
        for (; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("მასივში არის " + count+ " ლუწი რიცხვი");
        }
    }
}
