import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.print("Input integer number: ");
            int inputNumber1 = new Scanner(System.in).nextInt();
            if(inputNumber1 == 0){
                break;
            }

            System.out.print("Input integer number: ");
            int inputNumber = new Scanner(System.in).nextInt();

            System.out.print("Input ariphmetic operation: ");
            String inputOperations = new Scanner(System.in).nextLine();



            ariphmeticOperation(inputNumber, inputOperations);

        }
    }

    public static void  ariphmeticOperation(int inputNumber, String inputOperations) {
       int sum = 0;

        for (int i = 0; i < 10; i++) {
            if (inputOperations.equals("+")) {

                sum = inputNumber + i;
            }
            if (inputOperations.equals("*")) {

                sum = inputNumber * i;
            }

            System.out.println(sum);
        }

    }
}


