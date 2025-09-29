import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//Task 1
        String serviceInput;
        String serviceLetter;
        String serivce;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter service code (P/L/T/C): ");

        serviceInput =input.nextLine();
        serviceInput = serviceInput.strip().toUpperCase();

        serviceLetter = serviceInput.substring(0,1);

        serivce="N/A";

        switch (serviceLetter){
            case "P":
                serivce ="Pharamacy";
                break;
            case "L":
                serivce ="Lab";
                break;
            case "T":
                serivce ="Triage";
                break;
            case "C":
                serivce ="Counseling";
                break;
            default:
                System.out.println("Invalid service code");
                break;
        }
        System.out.println("Go to: " + serivce);
//Task 2
        double weight;
        double height;
        int healthMetic;
        double bmi;
        float bmiRound;
        double dosage=0;
        double tabletNo=0;
        double angle;
        double sinAngle;
        double cosAngle;


        String bmiCat="N/A";


        System.out.println("Enter the health metric:" + "\n" +
                "metric: 1 for BMI, 2 for Dosage round-up, 3 for simple trig helper: ");

        healthMetic =input2.nextInt();


        switch (healthMetic) {
            case 1:
                System.out.println("\n" + "Enter your weight (in kg): ");
                weight = input2.nextDouble();

                System.out.println("\n" + "Enter your height (in m): ");
                height = input2.nextDouble();

                bmi = weight / Math.pow(height, 2);
                bmiRound = (float) (Math.round(bmi * 10) / 10.0);

                if (bmiRound < 18.5) {
                    bmiCat = "Underweight";
                } else if (bmiRound >= 18.5 && bmiRound <= 24.9) {
                    bmiCat = "Normal";
                } else if (bmiRound >= 25 && bmiRound <= 29.9) {
                    bmiCat = "Overweight";
                } else {
                    bmiCat = "Obese";
                }

                System.out.println("\n" + "You are " + bmiCat);
                break;

            case 2:
                System.out.println("\n" + "Enter the required dosage (in mg): ");
                dosage = input2.nextDouble();

                tabletNo = dosage / 250;

                System.out.println("\n" + "You need " + Math.ceil(tabletNo) + " tablets.");

                break;
            case 3:
                System.out.println("\n" + "Enter the angle (in degrees): ");
                angle = input2.nextDouble();
                sinAngle = Math.sin(Math.toRadians(angle));
                cosAngle = Math.cos(Math.toRadians(angle));

                System.out.println("The angle is " + Math.round(angle * 1000) / 1000.0);
                System.out.println("The angle in sin is " + Math.round(sinAngle * 1000) / 1000.0);
                System.out.println("The angle in cos is " + Math.round(cosAngle * 1000) / 1000.0);
        }

//Task 3



    }
}