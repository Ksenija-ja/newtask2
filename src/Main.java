public class Main {
    public static void main(String[] args) {

        int account = 300;
        int payment = 1200;
        int bonus = payment > 1000 ? payment / 100 : 0;

        int total = account + payment + bonus;

        System.out.println("Итоговый счет:" + total);
    }
}