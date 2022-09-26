import java.util.Random;
import java.util.Scanner;

public class SmallestInt {

  public void bubbleSort(int[] arr) {
    int n = arr.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1] > arr[j]) {
          //swap elements
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  void printArray(int arr[]) {
    for (int i = 0; i < arr.length; ++i) System.out.print(arr[i] + " ");
    System.out.println();
  }

  public int findKthSmallest(int arr[], int k) {
    bubbleSort(arr);
    // as an array is always a zero indexing
    // therefore, the kth smallest element lies
    // at the k - 1 index
    return arr[k - 1];
  }

  public static void main(String[] args) {
    Random ran = new Random();
    Scanner scan = new Scanner(System.in);

    // the k input value to 1
    System.out.print("Enter the number for the smaleest element: ");
    int k = scan.nextInt();

    // 1-10
    int arraySize = ran.nextInt(10) + 1;

    // new object
    SmallestInt obj = new SmallestInt();

    // random array
    int[] array = new int[arraySize];
    for (int i = 0; i < array.length; i++) {
      array[i] = ran.nextInt(1000); // storing random integers in an array
      System.out.print(array[i] + " "); // printing each array element
    }

    // sort the array and print it
    obj.bubbleSort(array);
    obj.printArray(array);

    // find the smallest k number
    int number = obj.findKthSmallest(array, k);

    System.out.println(
      "The " + k + "th smallest element of the array is: " + number
    );

    scan.close();
  }
}
