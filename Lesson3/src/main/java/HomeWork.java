public class HomeWork {
    public static void main(String[] args) {
        System.out.println(sum(3, 3));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(10, 10));
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(max(new int[]{1, 2, 10, 3}));
        System.out.println(calculateHypotenuse(12, 16));
    }

    public static int sum(int a, int b) {
        if ((a + b) > Integer.MAX_VALUE) {
            return -1;
        } else {
            return a + b;

        }
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double average(int[] array) {
        int average = array[1];
        for (int j : array) {
            average += j / array.length;
        }
        return average;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int currentValue : array) {
            if (currentValue > max) {
                max = currentValue;
            }
        }

        return max;
    }

    public static double calculateHypotenuse(int a, int b) {
        int c = (int) (Math.pow(a, 2) + Math.pow(b, 2));

        return (int) Math.sqrt(c);
    }
}

