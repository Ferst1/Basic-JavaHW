package HW11_10;
import java.util.Scanner;
public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        System.out.println("Введите третье целое число: ");
        int number3 = scanner.nextInt();

        int max = getMax(number1, number2, number3);

        System.out.println("Наибольшее из трех чисел: " + max);
    }

    public static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}


// Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
// Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
//Напечатает максимум из трех чисел.