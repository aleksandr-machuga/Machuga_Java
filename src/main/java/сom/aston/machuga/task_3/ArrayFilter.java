package сom.aston.machuga.task_3;


import java.util.concurrent.ThreadLocalRandom;

public class ArrayFilter {
    public static void main(String[] args) {
        int size = ThreadLocalRandom.current().nextInt(1, 100);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
