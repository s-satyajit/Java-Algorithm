import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        in.close();

        // switch(empID) {
        //     case 1 -> System.out.println("Satyajit Samal");
        //     case 2 -> System.out.println("Jio Air Fiber");
        //     case 3 -> {
        //         System.out.println("Employee Number 3");
        //         switch(department) {
        //             case "IT" -> System.out.println("IT Department");
        //             case "Management" -> System.out.println("Management Department");
        //             default -> System.out.println("Please enter a valid department");
        //         }
        //     }
        //     default -> System.out.println("Please enter a valid Employee ID");
        // }

        switch(empID) {
            case 1:
                System.out.println("Satyajit Samal");
                break;
            case 2:
                System.out.println("Jio Air Fiber");
                break;
            case 3:
                System.out.println("Employee Number 3");
                switch(department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Please enter a valid Department");
                }
                break;
            default:
                System.out.println("Please enter a valid Employee ID");
        }
    }
}