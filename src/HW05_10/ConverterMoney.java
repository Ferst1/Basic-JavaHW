package HW05_10;

import java.util.Scanner;

//N3
//        Программа запрашивает у пользователя сумму в Евро для конвертации
//        Реализовать метод, который конвертирует полученную сумму в сумму в долларах США
public class ConverterMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в евро: ");
        double euroAmount = scanner.nextDouble();

        // Вызываем метод для конвертации в доллары США
        double usdAmount = convertEuroToUSD(euroAmount);

        System.out.println(euroAmount + " евро равно " + usdAmount + " долларам США.");

        scanner.close();
    }

    // Метод для конвертации евро в доллары США
    public static double convertEuroToUSD(double euroAmount) {
        // Текущий курс евро к доллару (можно заменить на актуальный курс)
        double exchangeRate = 1.18; // Пример: 1 евро = 1.18 долларов
        double usdAmount = euroAmount * exchangeRate;
        return usdAmount;
    }
}
