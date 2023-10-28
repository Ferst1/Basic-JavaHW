package HW05_10;
//N2
//Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
public class Callorii {
    public static void main(String[] args) {
        int diameterSmallPizza = 24; // Диаметр первой пиццы (в см)
        int diameterLargePizza = 28; // Диаметр второй пиццы (в см)

        // Количество калорий в каждом квадратном сантиметре пиццы
        int caloriesPerSquareCm = 40;

        // Радиусы пицц
        double radiusSmallPizza = diameterSmallPizza / 2.0; // Радиус первой пиццы
        double radiusLargePizza = diameterLargePizza / 2.0; // Радиус второй пиццы

        // Площади пицц
        double areaSmallPizza = Math.PI * radiusSmallPizza * radiusSmallPizza; // Площадь первой пиццы
        double areaLargePizza = Math.PI * radiusLargePizza * radiusLargePizza; // Площадь второй пиццы

        // Разница в площади пицц
        double areaDifference = areaLargePizza - areaSmallPizza;

        // Количество лишних калорий
        int extraCalories = (int) (areaDifference * caloriesPerSquareCm);

        // Вывод результата
        System.out.println("Если купить пиццу диаметром " + diameterLargePizza + " см вместо " +
                diameterSmallPizza + " см, то будет лишних калорий: " + extraCalories);
    }

}



