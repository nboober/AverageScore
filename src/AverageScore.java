import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0 ;
        int average = 0 ;

        System.out.println("Please enter 10 exam Scores: ");
        for(int i = 0; i < 10; i++){

            System.out.println("Exam Score " + (i + 1) + " :");
            sum += scanner.nextInt();
        }

        average = sum/10;

        System.out.println("Your average exam score is: " + average);
    }
}
