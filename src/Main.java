public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
    }

    public static void checkLeapYear(int year) {

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(year + " год " + (isLeap ? "является" : "не является") +
                " високосным.");
    }

    public static void printMobileMsg(int year, int nOS) {

        String str;
        String strOS = (nOS == 0) ? "iOS" : "Android";

        if (year < 2015)
            str = "Установите облегченную версию приложения для " + strOS +
                    " по ссылке";
        else
            str = "Установите приложение для " + strOS +
                " по ссылке";
        System.out.println(str);

    }

    public static int cardDeliveryDays(int distance) {

        if (distance > 100) return 0; // Доставки нет

        int days;

        if (distance < 20);

    }

}