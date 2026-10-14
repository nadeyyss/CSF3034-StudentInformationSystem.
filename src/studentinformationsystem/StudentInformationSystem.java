/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author LENOVO
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String studentName = "Nurnadirah Najihah bt Hasbullah";
        String studentID = "s87628";

        int mark1 = 45;
        int mark2 = 45;

        int total = mark1 + mark2;

        System.out.println("Student Name:" + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);

        if (total >= 80) {
            System.out.println("Result: Excellent");
        } else if (total >= 50) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
