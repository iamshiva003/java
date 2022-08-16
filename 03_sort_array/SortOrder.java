import java.util.Scanner;

public class SortOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for(int i=0; i<size; i++) {
            System.out.println(" " + arr[i]);
        }

        int temp;
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting in ascending order: ");
        for(int i=0; i<size; i++) {
            System.out.println(" " + arr[i]);
        }
    }
}
