import java.util.Scanner;

/***
 * E7.3 Write a method sumWithoutSmallest that computes the sum of an array of values,
 * except for the smallest one, in a single loop. In the loop, update the sum and the smallest value.
 * After the loop, return the difference.
 */
public class SumWithoutSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please input Array Size:");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Input Arrays elements:");
        for(int i = 0;i < size;i++){
            array[i] = in.nextInt();
        }
        MyClass myClass = new MyClass();
        myClass.sumWithoutSmallest(array);
    }
}
class MyClass{
    public void sumWithoutSmallest(int[] array){
        int min = array[0];
        int sum = array[0];
        for(int i = 1;i < array.length;i++){
            if(min > array[i]) min = array[i];
            sum += array[i];
        }
        System.out.println("Smallest Element : " + min);
        System.out.println("Sum of the array without smallest element : " + (sum - min));
        System.out.println("Sum with all elements : " + sum);
        System.out.println("Difference : " + min);
    }
}