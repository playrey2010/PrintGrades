import java.util.Scanner;
public class GradePrinter {

    public static void main(String[] args) {
        int score;
        String grade = "";
        boolean again = true;


        Scanner sc = new Scanner(System.in);
        while (again) {
            System.out.println("Enter an exam score");
            score = sc.nextInt();

            switch (score/10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                case 5:
                    grade = "F";
                    break;
                default:
                    grade = "Z";
                    break;
            }
            if (grade.equals("Z") || grade.equals("F")) {
                System.out.println("Go back to school");
            } else {
                System.out.println("Good job. Your grade is " + grade);
                System.out.println("Do you want to enter another score (Y/N)?");

            }
        }
//        System.out.println("Enter an exam score");
//        score = sc.nextInt();
//
//        switch (score/10) {
//            case 10:
//            case 9:
//                grade = "A";
//                break;
//            case 8:
//                grade = "B";
//                break;
//            case 7:
//                grade = "C";
//                break;
//            case 6:
//                grade = "D";
//                break;
//            case 5:
//                grade = "F";
//                break;
//            default:
//                grade = "Z";
//                break;
//        }

        System.out.println(grade);
    }

}
