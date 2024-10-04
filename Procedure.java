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
public class Procedure {
    // Fields for procedure information
    private String procedureName, date, practitionerName;
    private double charges;
    
    // No-arg constructor
    public Procedure() {
    }

    // Parametrized constructor for name and date
    public Procedure(String procedureName, String date) {
        this.procedureName = procedureName;
        this.date = date;
    }

    // Parametrized constructor for all attributes
    public Procedure(String procedureName, String date, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.date = date;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors
    public String getProcedureName() {
        return procedureName;
    }

    public String getDate() {
        return date;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    // Mutators
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    //  display the procedural information using toString method 
    public String toString() {
        return "\t\t" + "Procedure: " + procedureName.trim() + "\n" +
               "\t\t" + "ProcrdureDate= " + date + "\n" +
               "\t\t" + "Practitioner= " + practitionerName + "\n" +
               "\t\t" + "Charges= " + String.format("%.2f", charges)+ "\n";
    }
}
