package HW16_10;
// Представим, что у нас есть устройство, в котором две колбы.
// Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
// Вы должны написать метод, который проверяет это устройство.
// Ваша программа должна иметь переменные temperature1 и temperature2.
// В результате метод возвращает true или false.

public class DeviceChecker {
    public static boolean isDeviceWorking(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int temperature1 = 110;
        int temperature2 = 90;
        boolean result = isDeviceWorking(temperature1, temperature2);
        System.out.println(result);  // Этот код выведет true, так как устройство работает в данном случае.
    }
}