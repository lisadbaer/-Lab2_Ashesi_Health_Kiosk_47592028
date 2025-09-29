import java.util.Scanner;

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
        String bmiCat="N/A";


        System.out.println("\n"+ "Enter the health metric:" + "\n"
                "metric: 1 for BMI, 2 for Dosage round-up, 3 for simple trig helper: ");

        healthMetic =input2.nextInt();

        System.out.println("\n"+ "Enter your weight: ");
        weight =input2.nextInt();

        System.out.println("\n"+ "Enter your height: ");
        height =input2.nextInt();

        switch (healthMetic){
            case "1":
                bmi=weight/Math.pow(height,2);
                bmiRound = (float) (Math.round(bmi * 10) / 10.0);
                if (bmiRound <18.5) {
                    bmiCat = "Underweight";
                 } else if (bmiRound >=18.5 && bmiRound <=24.9) {
                    bmiCat = "Normal";
                } else if (bmiRound >=25 && bmiRound <=29.9) {
                    bmiCat = "Overweight";
                } else {
                    bmiCat = "Obese";
                }

                System.out.println("\n"+"You are "+bmiCat);

                break;
            case "2":
                serivce ="Lab";
                break;
            case "3":
                System.out.println("Invalid service code");
        }





    }
}