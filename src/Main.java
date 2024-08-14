import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task 1
        int year = 2000;
        defineHighGradeYear(year);
        //task 2
        int clientOS = 0;
        int phoneYear = 2024;
        defineOS(clientOS, phoneYear);
        //task 3
        int deliveryDistance = 95;
        System.out.println("Для доставки потребуется дней: " + deliveryDay(deliveryDistance));
    }
    //task 1
    public static void defineHighGradeYear(int year) {
        boolean year4 = year % 4 == 0;
        boolean year100 = year % 100 != 0;
        boolean year400 = year % 400 == 0;
        if (year >= 1584 && year100 && year4 || year >= 1584 && year400) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
    }
    //task 2
    public static void defineOS (int clientOS, int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && phoneYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    //task 3
    public static int deliveryDay (int deliveryDistance) {
        byte deliveryDay = (byte) (1 + (deliveryDistance + 19) / 40f);
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставка не осуществляется!");
        }
        return deliveryDay;
    }
}