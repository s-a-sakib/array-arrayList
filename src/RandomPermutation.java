import java.util.ArrayList;
import java.util.Random;

/***
 * E7.7 Write a program that produces ten random permutations of the numbers 1 to 10. To generate a random permutation,
 * you need to fill an array with the numbers 1 to 10 so that no two entries of the array have the same contents.
 * You could do it by brute force, generating random values until you have a value that is not yet in the array.
 * But that is inefficient. Instead, follow this algorithm:
 * Make a second array and fill it with the numbers 1 to 10.
 * Repeat 10 times
 *    Pick a random element from the second array.
 *    Remove it and append it to the permutation array.
 */
public class RandomPermutation {
    public static void main(String[] args) {
        int n = 10,x;
        ArrayList <Integer> SecondArray = new ArrayList<Integer>(n);
        ArrayList <Integer> Permutation = new ArrayList<Integer>(n);

        for(int i = 1; i <= 10 ;i++){
            SecondArray.add(i);
            //Permutation.add(i);
        }
        Random rn = new Random();
        for(int i = 0;i<10;i++){
            x = rn.nextInt(10-i);
            Permutation.add(SecondArray.get(x));
            SecondArray.remove(x);
           // System.out.println(x);
        }
        System.out.println(Permutation);
        //new comment added
    }
}