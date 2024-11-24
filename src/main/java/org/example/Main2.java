package org.example;

public class Main2 {
    public static void main(String[] args) {

        checkNumber(-1); // ყოველი რიცხვის ჩაწერის შემდგომ შესაფერის პასუხი დაბრუნდება :)
    }
    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("დადებითი");
        } else if (number < 0) {
                System.out.println("უარყოფითი");
        } else {
            System.out.println("ნოლი");
        }
    }

}