public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long replenishment = 1789;
        long bonus = 0;
        bonus = replenishment / 100;

        long newBalance = balance + bonus + replenishment;

        System.out.println("На вашем счету " + newBalance + " рублей");
        System.out.println("Вам начислено " + bonus + " бонусных рублей");
    }
}
