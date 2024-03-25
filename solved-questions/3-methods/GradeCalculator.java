import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        double mark = in.nextDouble();
        in.close();
        gradeCalculator(mark);
    }

    static void gradeCalculator(double mark) {
        if(mark >= 91 && mark<= 100)
            System.out.print("AA");
        else if(mark >= 81 && mark <= 90)
            System.out.print("AB");
        else if(mark >= 71 && mark <= 80)
            System.out.print("BB");
        else if(mark >= 61 && mark <=70)
            System.out.print("BC");
        else if(mark >= 51 && mark <= 60)
            System.out.print("CD");
        else if(mark >= 41 && mark <= 50)
            System.out.print("DD");
        else if(mark <= 40)
            System.out.print("Fail");
    }

}
