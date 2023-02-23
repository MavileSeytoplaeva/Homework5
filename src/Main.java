public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        char clientOS = 0;
        switch (clientOS) {
            case 1 :
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0 :
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        char clientOS = 0;
        short clientDeviceYear = 2014;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <  2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        short year = 2028;
        int zeroDivision = year % 4;
        int divisionOnHundred = year % 100;
        int divisionOnFourHundred = year % 400;
        if (zeroDivision == 0) {
            if (divisionOnHundred != 1) {
                System.out.println("Год високосный.");
            } else if (divisionOnFourHundred == 0) {
                System.out.println("Год високосный.");
            }
        } else {
            System.out.println("Год обычный.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 105;
        int deliveryDays = 1;
        if (deliveryDistance > 20 && deliveryDistance < 100) {
            deliveryDays++;
            if (deliveryDistance > 60) {
                deliveryDays++;
            } else
            System.out.println("Требуется дней: "+deliveryDays);
        } else
            System.out.println("Так далеко доставки нет.");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("2-й месяц принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("3-й месяц принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("4-й месяц принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("5-й месяц принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("6-й месяц принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("7-й месяц принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("8-й месяц принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("9-й месяц принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("10-й месяц принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("11-й месяц принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("12-й месяц принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Месяцев всего 12.");
        }
    }
}