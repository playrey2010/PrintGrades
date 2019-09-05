import java.util.Scanner;
public class GradePrinter {

    public static void main(String[] args) {
        int score = 0;
        String grade = "";
        String again = "y";


        Scanner sc = new Scanner(System.in);
        while (again.equalsIgnoreCase("y")) {
            System.out.print("Enter an exam score: ");
            score = sc.nextInt();

            if (score >= 97 &&  score <= 100) {
                grade = "A+";
            } else if (score >= 94 &&  score <= 96) {
                grade = "A";
            } else if (score >= 90 &&  score <= 93) {
                grade = "A-";
            } else if (score >= 87 &&  score <= 89) {
                grade = "B+";
            } else if (score >= 84 &&  score <= 86) {
                grade = "B";
            } else if (score >= 80 &&  score <= 83) {
                grade = "B-";
            } else if (score >= 77 &&  score <= 79) {
                grade = "C+";
            } else if (score >= 74 &&  score <= 76) {
                grade = "C";
            } else if (score >= 70 &&  score <= 73) {
                grade = "C-";
            } else if (score >= 60 &&  score <= 69) {
                grade = "D";
            }

            if (score > 60 && score <= 100) {
                System.out.println("Good job. Your grade is " + grade + ".");
                System.out.println("Do you want to enter another score (Y/N)?");
                again = sc.next();
            } else if (score > 100) {
                System.out.println("Were bonuses allowed? Or did you cheat? ");
            }
            else {
                System.out.println("Go back to school.");
                System.out.println("Do you want to enter another score (Y/N)?");
                again = sc.next();
            }
        }
    }

}
