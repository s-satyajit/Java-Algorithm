public class Conditionals {
    public static void main(String[] args) {
        int salary = 30200;

        
        // if(salary > 20000)
        //     salary += 2000;
        // else
        //     salary += 1000;

        if(salary > 20000 && salary <30000)
            salary += 2000;
        else if(salary > 30000)
            salary += 3000;
        else
            salary += 1000;

        System.out.println(salary);

        // int a = 10;
        // int b = 20;
        // if(a == 10 && b == 20) {
        //     System.out.println(Hello World!);
        // }
        // if(a != 10 || b == 20) {
        //     System.out.println("Hello World!");
        // }
    }
}
