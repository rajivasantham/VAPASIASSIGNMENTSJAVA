
    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int option = 0;
            double num1, num2,result;
            result=0;

            System.out.println("Please Choose an option");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Division");
            System.out.println("5) Exit");
            System.out.print("Enter Option :");
            option = sc.nextInt();
            System.out.print("Enter the First Number :");
            num1 = sc.nextDouble();
            System.out.print("Enter the SECOND Number :");
            num2 = sc.nextDouble();
            do {

                switch (option) {
                    case 1: {
                        result = add(num1, num2);
                        break;
                    }
                    case 2: {
                        result = sub(num1, num2);
                        break;
                    }
                    case 3: {
                        result = mul(num1, num1);
                        break;
                    }
                    case 4: {
                        result = div(num1, num2);
                        break;
                    }
                    case 5: {

                        System.out.println("Program will now exit ");
                        System.exit(0);
                    }

                }
                System.out.println(" result " + result);
                System.out.print("Enter Option :");

                option = sc.nextInt();
                if (option < 5) {
                    System.out.print("Enter the Number :");
                    num1 = sc.nextDouble();
                }else if (option >= 5)
                {
                    System.out.println(" Final result " + result);
                    break;
                }

            } while (option != 5);

            sc.close();
        }

         static double add(double num1, double num2) {
            return num1 + num2;
        }

        static double sub(double num1, double num2) {
            return num1 - num2;
        }

         static double mul(double num1, double num2) {
            return num1 * num2;
        }

        static double div(double num1, double num2) {
            return num1 / num2;
        }

    }