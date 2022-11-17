import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 и 2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установитe облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установитe облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 <= 0 && year % 100 != 0 || year % 400 <= 0) {System.out.println(year +
                " год является високосным");}
        else {System.out.println(year + " год не является високосным");}

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {deliveryDay++;}
        if (deliveryDistance > 60) {deliveryDay++;}
        System.out.println("потребуется дней: " + deliveryDay);

        System.out.println("Задание 5");
        int monthNumber = 12;
            switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца неn");}
        }









    }