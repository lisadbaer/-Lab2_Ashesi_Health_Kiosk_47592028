import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Task 1
        String serviceInput;
        String serviceLetter;
        String serivce;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter service idLet (P/L/T/C): ");

        serviceInput = input.nextLine();
        serviceInput = serviceInput.strip().toUpperCase();

        serviceLetter = serviceInput.substring(0, 1);

        serivce = "N/A";

        switch (serviceLetter) {
            case "P":
                serivce = "Pharamacy";
                break;
            case "L":
                serivce = "Lab";
                break;
            case "T":
                serivce = "Triage";
                break;
            case "C":
                serivce = "Counseling";
                break;
            default:
                System.out.println("Invalid service idLet");
                break;
        }
        System.out.println("Go to: " + serivce);
//Task 2
        double weight;
        double height;
        int healthMetic;
        double bmi;
        float bmiRound;
        double dosage = 0;
        double tabletNo = 0;
        double angle;
        double sinAngle;
        double cosAngle;
        angle=0;

        double finalAngle=0;
        double finalSinAngle=0;
        double finalCosAngle=0;



        String bmiCat = "N/A";


        System.out.println("Enter the health metric:" + "\n" +
                "metric: 1 for BMI, 2 for Dosage round-up, 3 for simple trig helper: ");

        healthMetic = input2.nextInt();


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

                finalAngle = Math.round(angle * 1000) / 1000.0;
                finalSinAngle = Math.round(sinAngle * 1000) / 1000.0;
                finalCosAngle = Math.round(cosAngle * 1000) / 1000.0;

                System.out.println("The angle is " + finalAngle);
                System.out.println("The angle in sin is " + finalSinAngle);
                System.out.println("The angle in cos is " + finalCosAngle);
                break;

        }

//Task 3
        char letter;
        String idNum;

        //Generating random letter and first random number
        letter = (char) ('A' + (int) (Math.random() * 26));
        int num = 3 + (int) (Math.random() * 7);
        idNum = String.valueOf(num);

// converting to string
        String idLet = String.valueOf(letter);

// adding remaining numbers to idNum

        for (int i = 0; i < 3; i++) {
            num = 3 + (int) (Math.random() * 7);
            idNum = idNum.concat(String.valueOf(num));
        }

        String id = idLet + idNum;
        System.out.println(id);
        System.out.println("len: "+id.length());
        //String code1 = String.valueOf(idLet.charAt(0));
        // String code2 = String.valueOf(idLet.charAt(2));
        // String code3 = idLet.substring(idLet.length() - 2);


        if (id.length() != 5) {
            System.out.println("Invalid length");
        } else if (!Character.isLetter(idLet.charAt(0))) {
            System.out.println("Invalid output, missing Letter");
        } else {
            boolean allDigits = true;
            for (int n = 1; n < id.length(); n++) { // check only last 4 chars
                if (!Character.isDigit(id.charAt(n))) {
                    allDigits = false;
                    break;
                }
            }

            if (!allDigits) {
                System.out.println("Invalid output, not enough digits");
            } else {
                System.out.println("ID okay");
            }
        }

//Task 4
        input.nextLine();
        String name;
        System.out.println("Enter your name: ");
        name = input.nextLine();
        char base = name.charAt(0);
        char baseShift = (char)('A' + (base - 'A' + 2) % 26);
        String lastNo = idNum.substring(idNum.length() - 2);
        String code;

        int finalNum = 0;

        switch (healthMetic) {
            case 2:
                finalNum = (int) Math.ceil(tabletNo); // round UP to nearest int
                break;
            case 3:
                finalNum = (int) Math.round(finalAngle); // nearest int
                break;
        }

        if (healthMetic == 2 || healthMetic == 3) {
            code = String.valueOf(base) + baseShift + base + lastNo + finalNum;
        } else {
            code = String.valueOf(base) + baseShift + base + lastNo;
        }

        //Task 5

        String summary = serivce + " | ID= " + id +" | Code= " + code;
        System.out.println(summary);

    }
}