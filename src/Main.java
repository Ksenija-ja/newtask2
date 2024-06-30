public class Main {
    public static void main(String[] args) {

int account = 200;
int payment = 1300;
int bonus = payment>1000 ? payment/100 : 0;

int total = account + payment + bonus;

        System.out.println("Итоговый счет:" + total);
    }
}