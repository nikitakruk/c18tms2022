import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //dayOfTheWeek();
        //amoeba();
        //numberOfDigits();
        //System.out.println (getZodiacName(7,15));
        //System.out.println(summ(1, 10000));
        // reverseOrder();
        // maximumElement();
        // oddIndex();
        // changeTheMaximumToTheZeroElement();
        matrixTransposition();
    }


    //1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

    private static void dayOfTheWeek() {
        Random random = new Random();
        int randomPeriod = random.nextInt(7) + 1;
        //System.out.println(randomPeriod);
        switch (randomPeriod) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("пятница");
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = (int) Math.ceil(Math.log10(Math.abs(number)));
        if (number > 0) {
            System.out.println(number + " - это положительное число, количество цифр = " + count);
        } else if (number < 0) {
            System.out.println(number + " - это отрицательное число, количество цифр = " + count);
        } else {
            System.out.println("Ошибка");

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

    //        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void reverseOrder() {
        int[] massive = new int[50];
        for (int i = 1, j = 0; i < 100; i += 2, j++) {
            massive[j] = i;
        }
        System.out.println(Arrays.toString(massive));
        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.print(massive[i] + " ");
        }
    }

    //        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void maximumElement() {
        int[] massive = new int[12];
        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(massive));
        findingMax(massive);
        System.out.println();
    }

    public static void findingMax(int[] massive) {
        if (massive != null && massive.length > 0) {
            int currentMax = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int i = 1; i < massive.length; i++) {
                if (massive[i] >= currentMax) {
                    currentMax = massive[i];
                    maxIndex = i;
                }
            }
            System.out.println("Максимальный эелемент " + currentMax + ", индекс его последнего вхождения в массив = " + (maxIndex));
        } else {
            System.out.println("");
        }
    }

    //        9) Создайте массив размера 20, заполните его случайными целыми числами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    public static void oddIndex() {
        int[] massive = new int[20];
        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            if (i % 2 != 0) {
                massive[i] = 0;
            }
        }
        System.out.println(Arrays.toString(massive));
    }

    //        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void changeTheMaximumToTheZeroElement() {
        int[] massive = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int currentMax = Integer.MIN_VALUE;
        int maxPlace = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > currentMax) {
                currentMax = massive[i];
                maxPlace = i;
            }
        }
        massive[maxPlace] = massive[0];
        massive[0] = currentMax;
        System.out.println(Arrays.toString(massive));
    }

    //        12) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void matrixTransposition() {
        Random random = new Random();
        System.out.println("Введите размер матрицы (целое положительное число)");
        Scanner input;
        int dim;
        while (true) {
            input = new Scanner(System.in);
            if (input.hasNextInt()) {
                dim = input.nextInt();
                if (dim > 0) {
                    break;
                }
            }
            System.out.println("Введите целое положительное число");
        }
        int[][] matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = random.nextInt(51);
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        transpose(matrix);
    }

    public static void transpose(int[][] matr) {
        int[][] transposedMatr = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                transposedMatr[j][i] = matr[i][j];
            }
        }
        for (int i = 0; i < transposedMatr.length; i++) {
            for (int j = 0; j < transposedMatr.length; j++) {
                System.out.printf("%2d ", transposedMatr[i][j]);
            }
            System.out.println();
        }
    }
}




