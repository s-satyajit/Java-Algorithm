public class ThreeDigitArmstrongNum {
    public static void main(String[] args) {
        printThreeDigitArmstrongNum();
    }

    static void printThreeDigitArmstrongNum() {
        for(int i = 100; i<=999; i++) {
            if(isArmstrong(i))
                System.out.println(i);
        }
    }

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sumOfCube = 0;
        while(num>0) {
            int rem = num % 10;
            sumOfCube += Math.pow(rem, 3);
            num /= 10;
        }

        return sumOfCube == originalNum;
    }

}