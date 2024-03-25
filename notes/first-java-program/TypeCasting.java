// import java.util.Scanner;

public class TypeCasting{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // int num = input.nextInt();
        // System.out.println(num);


        //type casting
        // int num = (int)(453.234f);
        // System.out.println(num);

        //automatic type promotion in expression
        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);

        // byte a = 34;
        // byte b = 127;
        // byte c = 23;
        // int d = a*b/c;
        // System.out.println(d);

        // byte b = 50;
        // b = b*2;

        // int number = 'A';
        // System.out.println(number);

        byte b = 43;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 23.234f;
        double d = 0.23423;
        double result = (f*b) + (i/c) - (d-s);
        //float + int - double = double
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);

    }
}