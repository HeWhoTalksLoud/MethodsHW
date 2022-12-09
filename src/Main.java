public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        checkLeapYear(1980);
        System.out.println();

        System.out.println("Задача 2");
        printMobileMsg(2015, 1);
        System.out.println();

        System.out.println("Задача 3");
        int daysToDeliver = cardDeliveryDays(10);
        System.out.println(daysToDeliver == 0 ? "Доставки нет" :
                "Потребуется дней: " + daysToDeliver);
        System.out.println();
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

        int days = 0;

        if (distance < 20) days = 1;
        else if (distance < 60) days = 2;
                else if (distance < 100) days = 3;

        return days; // Если расстояние > 100, возвращаем 0 - доставки нет

    }

}