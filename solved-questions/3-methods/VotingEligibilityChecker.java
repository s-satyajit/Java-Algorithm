import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age of the candidate: ");
        int age = in.nextInt();
        in.close();
        votingEligibility(age);
            
    }

    static void votingEligibility(int age) {
        if(age >= 18)
            System.out.print("The candidate is eligible to vote");
        else
            System.out.print("The candidate is not eligible to vote");
    }

}
