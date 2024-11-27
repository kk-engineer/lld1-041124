package in.itkaran.lld1_041124.lld1.class13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

//        try {
//            demoFileException();
//        }
//
//        catch (FileNotFoundException e) {
//            System.out.println("File not found exception " + e.getMessage());
//        }
//        catch (IOException e) {
//            System.out.println("IO Exception " + e.getMessage());
//        }
//        catch (Exception e) {
//            System.out.println("Exception " + e.getMessage());
//        }



//        try {
//            demoDivideByZero(new Scanner(System.in));
//        }
//
//        catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception - Divide by zero exception " + e.getMessage());
//        }
//        catch (Exception e) {
//            System.out.println("Exception " + e.getMessage());
//        }


        demoFinally();
    }

    private static void demoFinally() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Demo Divide By Zero");
            System.out.println("Enter 2 numbers");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println(num1 / num2);
//            System.exit(0);
//            return;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception - Divide by zero exception " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
            throw e;
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println("After finally block");
    }

    private static void demoDivideByZero(Scanner scanner) {
        System.out.println("Demo Divide By Zero");
        System.out.println("Enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num2 == 0) {
            throw new ArithmeticException("Test: Divide by zero exception");
        }
        System.out.println(num1 / num2);

    }

    private static void demoFileException() throws FileNotFoundException, IOException {
        System.out.println("Demo File Exception");
        File file = new File("abc.txt");
//        try {
//            FileReader fileReader = new FileReader(file);
//            fileReader.read();
//        } catch (Exception e) {
//            System.out.println("File not found exception");
//        }
//
        FileReader fileReader = new FileReader(file);
        fileReader.read();
    }


}
