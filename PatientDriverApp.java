/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: 
 * Due: 10/04/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Barkot Kifle
*/


import java.util.Scanner;

public class PatientDriverApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a patient instance from user input
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter street address: ");
        String streetAddress = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state: ");
        String state = scanner.nextLine();
        System.out.print("Enter ZIP code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Enter emergency contact name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.print("Enter emergency contact phone: ");
        String emergencyContactPhone = scanner.nextLine();
        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter your M#: ");
        int mNumber = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the date (MM/DD/YYYY): ");
        String inputDate = scanner.nextLine();
        
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, emergencyContactName, emergencyContactPhone);

        // Create three procedures
        Procedure proc1 = new Procedure("Physical exam", "07/20/2019", "Dr. Irvine", 3250.00);
        Procedure proc2 = new Procedure("\nX-Ray", "07/20/2019", "Dr. Jamison", 5500.00);
        Procedure proc3 = new Procedure("\nBlood test", "07/20/2019", "Dr. Smith", 1400.00);

        // Display patient and procedure info
        displayPatient(patient);
        displayProcedure(proc1);
        displayProcedure(proc2);
        displayProcedure(proc3);

        // Calculate and output the total charges
        double totalCharges = calculateTotalCharges(proc1, proc2, proc3);
        System.out.println("\nTotal Charges: $" + String.format("%.2f", totalCharges));

        // Output student information
        System.out.println("\nStudent name: " + studentName);
        System.out.println("M#: " + mNumber);
        System.out.println("Date: " + inputDate);
    }

    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient info:\n" + patient.toString());
    }
    
    public static void displayProcedure(Procedure procedure) {
        System.out.println(  procedure.toString());
    }
   

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}
