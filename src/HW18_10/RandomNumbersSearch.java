package HW18_10;
import java.util.Random;
public class RandomNumbersSearch {
    public static void main(String[] args) {
        int[] randomNumbers = new int[8];
        Random random = new Random();

        // Заполняем массив случайными целыми числами в интервале [1;50]
        for (int i = 0; i < 8; i++) {
            randomNumbers[i] = random.nextInt(50) + 1;
        }

        // Выводим исходный массив
        System.out.print("Исходный массив: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Заменяем элементы с нечетными индексами на ноль
        for (int i = 1; i < 8; i += 2) {
            randomNumbers[i] = 0;
        }

        // Выводим массив после замены
        System.out.print("Массив после замены: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
    }
}


