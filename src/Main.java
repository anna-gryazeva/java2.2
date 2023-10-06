public class Main {
    public static void main(String[] args) {
        int initialBalance = 500;
       int replenishmentAccount = 1500;

       int bonus = 0;
       if (replenishmentAccount > 1000) {
           bonus = replenishmentAccount / 100;
       }

       int finalBalance = initialBalance + replenishmentAccount + bonus;
        System.out.println("Итог: " + finalBalance);
        System.out.println("Бонус: " + bonus);



    }
}