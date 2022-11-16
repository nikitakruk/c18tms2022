import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {
        dayOfTheWeek();
    }


    //1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
    private static void dayOfTheWeek() {
        int max = 8;
        int min = 1;
        Random random = new Random();
        int randomPeriod = random.nextInt(max - min) + min;
        //System.out.println(randomPeriod);
        switch (randomPeriod) {
            case (1) -> System.out.println("Понедельник");
            case (2) -> System.out.println("Вторник");
            case (3) -> System.out.println("Среда");
            case (4) -> System.out.println("Четверг");
            case (5) -> System.out.println("пятница");
            default -> System.out.println("Выходной");
        }
    }
}
