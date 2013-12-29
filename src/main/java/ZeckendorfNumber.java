public class ZeckendorfNumber {

    // Fibonacci numbers
    private static int[] fibonacci = {1, 2, 3, 5, 8, 13};

    public static int create(int number) {
        for (int i = (fibonacci.length - 1); i >= 0; i--) {
            if (number >= fibonacci[i]) {
                int zeck = (i == 0) ? 1 : ((int) Math.pow(10, i));
                return zeck + create(number - fibonacci[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.println(i + ":\t" + create(i));
        }
    }

}
