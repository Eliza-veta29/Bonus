public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println("Введите цену билета для того, чтобы узнать количество бонусных миль");

        int price = 0;
        int rub = 20;
        int miles = price / rub;
        boolean bonusMiles = rub > price;
        if (bonusMiles) {
            System.out.println("Сейчас нет миль для начисления");
        } else {
            System.out.println(miles + " бонусных миль(и)");
        }
        System.out.println("До свидания!");
    }
}



