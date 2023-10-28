package HW05_10;
//1 уровень сложности: N1
////        Переведите число 333 из 16-ричной в 10-ричную
////        Переведите число 819 из 10-ричной в 16-ричную
////        101101 в двоичной, переведите в 10-ричную
////        124 в десятичной, переведите в 2-ичную
public class ConverterSimple {
    public static void main(String[] args) {
        //        Переведите число 333 из 16-ричной в 10-ричную

        String hexNumber = "333"; // 16-ричное число
        int decimalNumber = Integer.parseInt(hexNumber, 16);
        System.out.println("Число в 10-ричной системе: " + decimalNumber);

//        Переведите число 819 из 10-ричной в 16-ричную

        int numberToConvert = 819; // Ваше 10-ричное число
        String octoNumber = Integer.toHexString(numberToConvert);
        System.out.println("Число в 16-ричной системе: " + octoNumber);

//        101101 в двоичной, переведите в 10-ричную

        String binaryNumber = "101101"; // 2-ичное число
        int binNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("Число в 10-ричной системе: " + binNumber);

        //        124 в десятичной, переведите в 2-ичную

        int decNumber = 124; // 10-ричное число
        String binarNumber = Integer.toBinaryString(decNumber);
        System.out.println("Число в 2-ичной системе: " + binarNumber);
    }


}




