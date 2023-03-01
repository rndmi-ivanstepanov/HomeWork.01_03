public class Array {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum + " - expenses for this month");
        System.out.println();
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int max = 0;
        int min = 200_001;

        for (int i : arr) {

            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }
        }
        System.out.println(min + " - minimal expenses in bygone month \n" + max + " - greatest expenses in bygone month");
        System.out.println();
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        double averageExp = (double) sum / 30;

        System.out.printf("average spending in bygone month: %.2f", averageExp);
        System.out.println("\n");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}