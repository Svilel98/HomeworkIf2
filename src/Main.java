import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите свой операционную систему, если IOS, то нажмите 0, если Android, то нажмите 1");
        byte clientOs = scanner.nextByte();
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Введите корректное число2");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой операционную систему, если IOS, то нажмите 0, если Android, то нажмите 1");
        byte clientOs = scanner.nextByte();
        System.out.println("Введите год создания вашего телефона");
        short clientDeviceYear = scanner.nextShort();
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Введите корректное число для ОС");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int enterYear = scanner.nextInt();
        if ((enterYear % 4) == 0 && ((enterYear % 100) != 0 || (enterYear % 400) == 0)) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние до вашего дома от нашего офиса");
        int deliveryDistance = scanner.nextInt();
        int deliveryDay = 0;
        if (deliveryDistance <= 20) {
            deliveryDay += 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            deliveryDay += 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            deliveryDay += 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        System.out.println("Введите месяц");
        Scanner scanner = new Scanner(System.in);
        byte monthNumber = scanner.nextByte();
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
                System.out.println("Номер месяца больше 12.");
        }
    }
}