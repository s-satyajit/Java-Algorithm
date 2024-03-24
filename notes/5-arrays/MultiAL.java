import java.util.Scanner;
import java.util.ArrayList;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<> (10);

        //initialisation
        for(int x = 0; x < 3; x++) {
            list.add(new ArrayList<>());
        }

        //add elements
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        in.close();

        System.out.println(list);
    }
}