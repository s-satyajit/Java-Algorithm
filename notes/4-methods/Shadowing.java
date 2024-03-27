public class Shadowing {
    static int x = 90;  //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);   //90
        
        int x;
        
        x = 50;    //the class variable at line 2 is shadowed by this
        //scope will begin when value is initialised

        System.out.println(x);   //50
        // x = 50;
        // int x = 40;
        System.out.println(x);
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
