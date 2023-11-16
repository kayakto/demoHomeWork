package ru.netology.ealexeev;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int counter = 0;
        int[] sums = new int[5];
        while (true) {
            System.out.println("SUM TRANSACTION:");
            sums[counter] = scanner.nextInt();
            scanner.nextLine();
            counter += 1;
            if (counter == 5) {
                break;
            }
        }

        System.out.println("Аmounts of five transactions" + Arrays.toString(sums));
    }
}
