public class Main {
    public static void main(String[] args) {

        int ticket = 50;
        int amount = 20;
        int bonus = 1;
        int all;
        int mile;

        if (ticket <= 20) {
            mile = 1;
            System.out.println("Ваш бонус за купленный былет=" + mile);
        } else {
            mile = 0;
            System.out.println("Ваш бонус за купленный былет =" + mile);
        }

        if (ticket > 20) {
            all = ticket / 20;
            System.out.println("Ваш бонус за купленный былет =" + all);
        }
    }
}
