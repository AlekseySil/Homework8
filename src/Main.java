import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1,2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] numbers_2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers_2.length; i++) {
            System.out.print(numbers_2[i]);
            if (i != numbers_2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] numbers_3 = {1, 10, 100};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers_3[i]);
            if (i != numbers_3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] numbers_2 = {1.57, 7.654, 9.986};
        for (int i = numbers_2.length - 1; i >= 0; i--) {
            System.out.print(numbers_2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] numbers_3 = {1, 10, 100};
        for (int i = numbers_3.length - 1; i >= 0; i--) {
            System.out.print(numbers_3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 4");
        int [] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0){
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.print(Arrays.toString(numbers));
    }
}