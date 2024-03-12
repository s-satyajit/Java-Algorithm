public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Satyajit";
        {
            // int a = 78;    //already initialized outside the block in the same method, hence you cannot initialise again
            a = 100;   //reassign the origin reference variable to some other value
            System.out.println(a);
            int c = 99;      //values initliased in this block , will remain in block
            name = "Rahul";
             System.out.println(name);
        }

        // scoping in for loops
        for(int i = 0;i<4; i++) {
            System.out.println(i);
            // int a = 50;
        }
        // System.out.println(i); 

        //  Anything that is initialised outside the block, can be used inside the block, but anything that is initialised inside the block cannot be used outside
        // Similiarly, anything that is initialised outside the block, cannot be initialised inside the block, but anything that is inilialised inside the block, can definitely initialised outside the block

        System.out.println(a);
        System.out.println(name);
        // System.out.println(c);     //cannot use outside the block
    }
}
