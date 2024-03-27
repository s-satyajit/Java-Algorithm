import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(23, 32423, 34535, 2343, 23423);

        multiple(23, 534, "Satyajit", "AirFiber", "Lipun");

        // demo(4, 5, 23, 23, 123);
        demo("Satyajit", "JioAirFiber", "Bisleri", "Boat");

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

}