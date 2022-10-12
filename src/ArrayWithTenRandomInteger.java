import java.util.Scanner;

/***
 *  E7.1 Write a program that initializes an array with ten random integers and then prints four lines of output, containing
 * • Every element at an even index.
 * • Every even element.
 * • All elements in reverse order.
 * • Only the first and last element.
 */
public class ArrayWithTenRandomInteger {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ArraySize = 10;
        int[] Array = new int[ArraySize];
        for(int i = 0; i < Array.length;i++){
            Array[i] = in.nextInt();
        }

        EvenIndex evenIndex = new EvenIndex(Array);
        EvenElement evenElement = new EvenElement(Array);
        ArrayRev arrayRev = new ArrayRev(Array);
        Element element = new Element(Array);
    }
}
class EvenIndex {
    public EvenIndex(int[] Array) {
        System.out.println("Printing every element at an even index:");
        for (int i = 1; i < Array.length; i += 2) {
            System.out.printf(Array[i] + "  ");
        }
        System.out.println();
    }
}

class EvenElement {
    public EvenElement(int[] Array){
        System.out.println("Printing every even element:");
        for(int it : Array){
            if(it%2==0)
                System.out.printf(it+"  ");
        }
        System.out.println();
    }
}

class ArrayRev{
    public ArrayRev(int[] Array){
        System.out.println("All elements in reverse order:");
        for(int i = Array.length - 1; i >=0;i--){
            System.out.printf(Array[i]+"  ");
        }
        System.out.println();
    }
}

class Element{
    public Element(int[] Array){
        System.out.println("Only the first and last element");
        System.out.println(Array[0]+"   "+Array[Array.length-1]);
    }
}