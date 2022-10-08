import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2021);
        getDeviceLink(0, 2005);
        int deliveryDays = calculateDeliveryDays(60);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void checkLeapYear(int year) {
        // Задание 1
        System.out.println("Задание 1");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "  — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
            System.out.println();
        }
    }

    public static void getDeviceLink(int osType, int manufacturingYear) {
        // Задание 2
        System.out.println("Задание 2");
        if (osType != 1 && osType != 0) {
            throw new IllegalArgumentException("Wrong OS Type");
        }
        int currentYear = LocalDate.now().getYear();
        if (manufacturingYear > currentYear) {
            throw new IllegalArgumentException("Wrong manufacturing year");
        }
        String osString = osType == 0 ? "iOS" : "Android";
        String versionString = manufacturingYear > 2015 ? "полную" : "облегчённую";
        System.out.printf("Установите %s версию для %s по ссылке%n", versionString, osString);
        System.out.println();
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        // Задание 3
        System.out.println("Задание 3");
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}






