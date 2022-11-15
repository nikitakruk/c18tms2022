public class HomeWork {
    public static void main(String[] args) {
        System.out.println(sum(3, 3));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(10, 10));
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(max(new int[]{1, 2, 10, 3}));
        System.out.println(calculateHypotenuse(12, 16));
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        if ((long) a + b > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }

    // Метод должен вернуть максимальное значение из двух чисел

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    // Метод должен вернуть среднее значение из массива чисел

    public static double average(int[] array) {
        double average = 0;
        for (int value : array) {
            average += value;
        }
        return average / array.length;
    }

    /**
     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        if (array != null && array.length > 0) {
            int max = array[0];
            for (int currentValue : array) {
                if (currentValue > max) {
                    max = currentValue;
                }
            }
            return max;
        }
        return 0;
    }

    public static double calculateHypotenuse(int a, int b) {
        int c = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        return (int) Math.sqrt(c);
    }
}

