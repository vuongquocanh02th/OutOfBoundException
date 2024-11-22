import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rand = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List element of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        Integer[] arr = example.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chi so cua mot phan tu bat ky: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so 5 " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chi so vuot qua gioi han mang!");
        }
    }
}
