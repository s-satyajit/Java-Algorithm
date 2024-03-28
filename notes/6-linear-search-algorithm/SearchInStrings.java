import java.util.Arrays;

public class SearchInStrings{
    public static void main(String[] args) {
        String name = "Satyajit";
        char target = 'y';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str, char letter) {
        if(str.length() == 0)
            return false;

        for(char ch : str.toCharArray()) {
            if(ch == letter)
                return true;
        }
        return false;
    }

    static boolean search(String str, char letter) {
        if(str.length() == 0)
            return false;

        for(int index = 0; index < str.length(); index++) {
            if(letter == str.charAt(index)) 
                return true;
        }
        return false;
    }
}