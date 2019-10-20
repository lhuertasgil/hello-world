import java.util.Scanner;

public class computerEducation {

    public static void main(String args []) {

        int answersCorrect = 0;
        int rightCounter = 0;
        int answer, userInput, grade;
        int response = 0;
        int [] operands = new int[2];
        String question;

        Scanner sc = new Scanner(System.in);

        while (response != 1) {

            while (answersCorrect <= 10) {

                question = secureRandom(operands);
                answer = operands[0] * operands[1];

                System.out.print(question);
                userInput = sc.nextInt();

                while (userInput != answer) {

                    displayIncorrectMessage();
                    System.out.println(question);
                    userInput = sc.nextInt();

                }

                displayCorrectMessage();
                rightCounter += rightCounter;
                answersCorrect++;

            }

            grade = (rightCounter * 10) / 100;
            if (grade > 70) {
                System.out.println("Congrats, you're ready to go to the next level");
            } else {
                System.out.println("Please ask your teacher for extra help");
            }

            System.out.println("Do you wish to restart? [0 = yes, 1 = no]");
            response = sc.nextInt();
            if ( response == 0 )
                answersCorrect = 0;
        }




    } //end of main

    public static String secureRandom (int[] operands) {

        String question;
        int min = 1, max = 9;

        operands[0] = min + (int)(Math.random() * ( (max - min) + 1) );
        operands[1] = min + (int)(Math.random() * ( (max - min) + 1) );

        question = "What is " + operands[0] + " times " + operands[1];
        return question;

    } //end of newQuestion

    public static void displayCorrectMessage() {

        int i;
        String message = "";

        int min = 0, max = 3;

        i = min + (int)(Math.random() * ( (max - min) + 1) );

        switch (i) {

            case 0:
                message = "Very good!";
                break;
            case 1:
                message = "Excellent";
                break;
            case 2:
                message = "Nice Work";
                break;
            case 3:
                message = "Keep up the good work";
                break;
            default:
                break;

        } //end of switch

        System.out.println(message);

    } //end of displaying correct message

    public static void displayIncorrectMessage() {

        int i;
        String message = "";

        int min = 0, max = 3;
        i = min + (int)(Math.random() * ( (max - min) + 1) );

        switch(i) {

            case 0:
                message = "No, please try again";
                break;
            case 1:
                message = "Wrong, Try one more time";
                break;
            case 2:
                message = "No, don't give up";
                break;
            case 3:
                message = "No, keep trying";
                break;
            default:
                break;

        } //end of switch

        System.out.println(message);

    } //end of incorrectMessage

} //end of class
