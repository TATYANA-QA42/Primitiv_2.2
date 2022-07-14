public class Main {
    public static void main(String[] args) {

        int balance = 0;
        int increase = 800;
        if (increase >= 1000) {
            int bonus = increase / 100 * 1;
            int summa = balance + increase + bonus;
            //System.out.println("Баланс:" + balance);
            //System.out.println("Пополнение:" + increase);
            System.out.println("Бонус:" + bonus);
            System.out.println("Сумма:" + summa);

        } else {
            int bonus = 0;
            int summa = balance + increase;
            //System.out.println("Баланс:" + balance);
            //System.out.println("Пополнение:" + increase);
            System.out.println("Бонус:" + bonus);
            System.out.println("Сумма:" + summa);

        }
    }
}