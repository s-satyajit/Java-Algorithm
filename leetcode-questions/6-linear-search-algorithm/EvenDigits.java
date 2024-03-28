public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for(int num : arr) {
            if(even(num))
                count++;
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n/=10;
        }
        return count;
    }
}