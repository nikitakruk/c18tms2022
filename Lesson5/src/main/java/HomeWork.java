import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //dayOfTheWeek();
        //amoeba();
        //numberOfDigits();
        //System.out.println (getZodiacName(7,15));
        //System.out.println(summ(3435, 5953));
    }


    //1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

    private static void dayOfTheWeek() {
        Random random = new Random();
        int randomPeriod = random.nextInt(8 - 1) + 1;
        // System.out.println(randomPeriod);
        switch (randomPeriod) {
            case (1) -> System.out.println("Понедельник");
            case (2) -> System.out.println("Вторник");
            case (3) -> System.out.println("Среда");
            case (4) -> System.out.println("Четверг");
            case (5) -> System.out.println("пятница");
            default -> System.out.println("Выходной");
        }
    }
    //Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    private static void amoeba() {
        int numberOfAmoebas = 1;
        int hours = 0;
        for (int i = 0; i < 8; i++) {
            numberOfAmoebas = numberOfAmoebas * 2;
            hours += 3;
            System.out.println(numberOfAmoebas + " амёбы через " + hours + " часов");
        }
    }
    // В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    private static void numberOfDigits() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            int count = (int) Math.ceil(Math.log10(Math.abs(number)));
            if (number > 0) {
                System.out.println(number + " - это положительное число, количество цифр = " + count);
                break;
            } else if (number < 0) {
                System.out.println(number + " - это отрицательное число, количество цифр = " + count);
                break;
            } else {
                System.out.println("Ошибка");
                continue;
            }
        }
    }
    //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

    public static String getZodiacName(int month, int day) {
        String result = null;
        if (month == 1 && day >= 21 && day <= 31 || month == 2 && day >= 1 && day <= 19) {
            result = "Водолей";
        } else if (month == 2 && day >= 20 && day <= 29 || month == 3 && day >= 1 && day <= 20) {
            result = "Рыбы";
        } else if (month == 3 && day >= 21 && day <= 31 || month == 4 && day >= 1 && day <= 20) {
            result = "Овен";
        } else if (month == 4 && day >= 21 && day <= 30 || month == 5 && day >= 1 && day <= 21) {
            result = "Телец";
        } else if (month == 5 && day >= 22 && day <= 31 || month == 6 && day >= 1 && day <= 21) {
            result = "Близнецы";
        } else if (month == 6 && day >= 22 && day <= 30 || month == 7 && day >= 1 && day <= 22) {
            result = "Рак";
        } else if (month == 7 && day >= 23 && day <= 31 || month == 8 && day >= 1 && day <= 21) {
            result = "Лев";
        } else if (month == 8 && day >= 22 && day <= 31 || month == 9 && day >= 1 && day <= 23) {
            result = "Дева";
        } else if (month == 9 && day >= 24 && day <= 30 || month == 10 && day >= 1 && day <= 23) {
            result = "Весы";
        } else if (month == 10 && day >= 24 && day <= 31 || month == 11 && day >= 1 && day <= 23) {
            result = "Скорпион";
        } else if (month == 11 && day >= 24 && day <= 30 || month == 12 && day >= 1 && day <= 22) {
            result = "Стрелец";
        } else if (month == 12 && day >= 23 && day <= 31 || month == 1 && day >= 1 && day <= 20) {
            result = "Козерог";
        } else {
            result = "Введены неправильные данные";
        }
        return result;
    }

    //        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ в методе main и распечатайте на консоль.
    private static int summ(int a, int b) {
        return Math.multiplyExact(a, b);
    }
    
}
