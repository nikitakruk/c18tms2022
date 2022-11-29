package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.description();
        for (int i = 0; i < 5; i++) {
            computer.turnOn();
        }
    }
}
