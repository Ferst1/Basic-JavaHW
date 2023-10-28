package HW23_10;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int missingNumber1 = findMissingNumber(arr1, 5);
        System.out.println("Отсутствующий элемент в arr1: " + missingNumber1);

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int missingNumber2 = findMissingNumber(arr2, 10);
        System.out.println("Отсутствующий элемент в arr2: " + missingNumber2);
    }

    static int findMissingNumber(int[] arr, int n) {
        // Вычисляем ожидаемую сумму элементов от 1 до n
        int expectedSum = (n * (n + 1)) / 2;

        // Вычисляем фактическую сумму элементов массива
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Недостающий элемент равен разнице между ожидаемой и фактической суммой
        int missingNumber = expectedSum - actualSum;

        return missingNumber;
    }
}
    // 1 уровень сложности: №1
//Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//input:
//arr[] = {1,2,3,5}
//out: 4
//
//arr[] = {6,1,2,8,3,4,7,10,5}
//out: 9

