package HW18_10;

import java.util.Random;

public class RandomIncreasingSequence {
    public static void main(String[] args) {
        int[] randomNumbers = new int[5];
        Random random = new Random();

        // Заполняем массив случайными целыми числами в интервале [10;99]
        for (int i = 0; i < 5; i++) {
            randomNumbers[i] = random.nextInt(90) + 10; // Диапазон [10;99]
        }

        // Выводим массив на консоль
        System.out.print("Сгенерированный массив: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Проверяем, является ли массив строго возрастающей последовательностью с использованием тернарного оператора
        boolean isIncreasing = true;
        for (int i = 1; i < 5; i++) {
            isIncreasing = (randomNumbers[i] > randomNumbers[i - 1]) ? isIncreasing : false;
        }

        // Выводим соответствующее сообщение на экран
        System.out.println(isIncreasing ? "Массив является строго возрастающей последовательностью." : "Массив не является строго возрастающей последовательностью.");
    }
}


