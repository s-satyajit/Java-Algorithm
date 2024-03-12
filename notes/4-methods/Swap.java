public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Satyajit Samal";
        // swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;
        
        swap(a, b);
        System.out.println(a + " " + b);

        changeName(name);
        System.out.println(name);


    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp; 
        // this change will only be valid in this function scope only.
    }

    static void changeName(String naam) {
        naam = "Joginder Sharma";  //Creating a new object, Strings can't be modified, the are final objects
    }

}
