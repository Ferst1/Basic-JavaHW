package HW11_10;


// 1 уровень сложности: 1) Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//         Реализует логический метод canBuy,  возвращающий boolean
//         Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//         Отобразите строку «Я могу купить еду, это ……» и значение.
public class Products {
    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);

        String message = "Я могу купить еду, это " + (canBuy ? "возможно" : "невозможно");
        System.out.println(message);
    }

    public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
    }

