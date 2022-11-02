public class HomeWork {
    public static void main(String[] args) {
        System.out.println(sum(150, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(10, 10));
        System.out.println(average(new int[]{2, 2, 3, 4, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
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
        if (a >= b) {
            return a;
        } else
            return b;
    }

    public static double average(int[] array) {

        return 0;
    }

    public static int max(int[] array) {

        return 0;
    }

    public static double calculateHypotenuse(int a, int b) {
        int c = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        int d = (int) Math.sqrt(c);

        return d;
    }
}

