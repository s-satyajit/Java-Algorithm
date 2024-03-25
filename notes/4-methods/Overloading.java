public class Overloading {
    public static void main(String[] args) {
        fun(2, 5);
        fun("Satyajit", "JioAirFiber");
        int ans = sum(2, 5);
        System.out.println(ans);
    }

    static void fun(int a, int b) {
        System.out.println("First One");
        System.out.println(a + " " + b);
    }
    static void fun(String x, String y) {
        System.out.println("Second One");
        System.out.println(x + " " + y);
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
