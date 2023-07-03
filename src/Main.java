
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int payment = 1315;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;

        } else {
            bonus = 0;
        }

        //int bonus = payment > 1000 ? payment /100 : 0;

        balance = balance + payment + bonus;

        System.out.println("Bonus = " + bonus);
        System.out.println("Balance = " + balance);

    }

}