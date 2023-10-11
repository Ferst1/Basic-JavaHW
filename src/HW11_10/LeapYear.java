package HW11_10;

import java.util.Scanner;

//2) Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год.
//        Метод isLeap проверяет високосный год или нет.
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (isLeap(year)) {
            System.out.println("Введенный год является высокосным.");
        } else {
            System.out.println("Введенный год не является высокосным.");
        }
    }

    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
