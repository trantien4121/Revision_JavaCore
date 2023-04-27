package Exception;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        if(b==0)
            throw new ArithmeticException();
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
}
