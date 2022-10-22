import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        leapYear();
        System.out.println("Task 2");
        deviceYear();
        System.out.println("Task 3");
        deliveryDays();
    }

    public static void leapYear() {
        int leapYear = 1400;
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год является високосным\n");
        } else System.out.println(leapYear + " год не является високосным\n");
    }


    public static void deviceYear() {
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = 2022;
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке\n");
                } else System.out.println("Установите lite версию приложения для iOS по ссылке\n");
                break;
            case 1:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Установите версию приложения для Android по ссылке\n");
                } else System.out.println("Установите lite версию приложения для Android по ссылке\n");
                break;
        }
    }

    public static void deliveryDays() {
        int deliveryDistance = 2;
        int days = 2 + (deliveryDistance - 20) / 40;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else
            System.out.println("Потребуется дней: " + days);
    }
}