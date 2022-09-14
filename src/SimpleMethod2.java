import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int numb) {
        return numb * numb;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        // This is the method call, create the square method.
        System.out.println("Square of " + numb + " is: " + SimpleMethod2.square(numb));


    }
}
