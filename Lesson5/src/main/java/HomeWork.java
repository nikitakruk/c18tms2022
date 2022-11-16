import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {
        //dayOfTheWeek();
        amoeba();
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
}
