
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Capacity of this sort: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int count = i + 1;
            int input;

            do {
                System.out.print("Number " + count + " (positive only): ");
                input = scanner.nextInt();
                if (input < 0) {
                    System.out.println("Please enter a positive number.");
                }
            } while (input < 0);

            numbers[i] = input;
        }

        bubbleSort(numbers);

        System.out.print("Sorted numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
