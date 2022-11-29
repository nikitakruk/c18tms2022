package by.tms.model;

import java.util.Random;
import java.util.Scanner;

@lombok.ToString
public class Computer {
    private String processor = "intel";
    private String ram = "8GB";
    private String hardDrive = "1TB";
    private int workCycle = 5;
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private boolean burned;

    public Computer(int workCycle) {
        this.workCycle = workCycle;
    }

    public Computer() {
    }

    public Computer(String processor, String ram, String hardDrive, int workCycle) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.workCycle = workCycle;
    }


    public void description() {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        System.out.println("Процессор: " + processor + "; " + "Оперативная память: " + ram + "; " + "Жесткий диск: " + hardDrive + "; " + "Количество циклов работы: " + workCycle);
    }

    public void turnOn() {
        if (!burned) {
            System.out.println("Внимание! Введите 0 или 1");
            int value = random.nextInt(2);
            if (workCycle > 0 && value == getEnteredValueFromConsole()) {
                System.out.println("Компьютер включился.");
                turnOff();
            } else {
                System.out.println("Компьютер сгорел!");
                burned = true;
            }
        }
       /* else {
            System.out.println("Компьютер сгорел!");
            burned = true;
        }*/
    }

    private void turnOff() {
        if (!burned) {
            System.out.println("Компьютер выключился.");
            workCycle--;
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    private int getEnteredValueFromConsole() {
        int count = 0;
        do {
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
            } else {
                System.out.println("ошибка");
                scanner.next();
            }
        } while (count < 0);
        return count;
    }
}

