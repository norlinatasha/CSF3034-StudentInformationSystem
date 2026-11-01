/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author norli
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // i. display student name and student ID
        System.out.println("Name: Norli Natasha binti Nor Esam");
        System.out.println("Student ID: S86374");
        
        // ii. store two marks using variables
        int mark1 = 85;
        int mark2 = 90;
        
        // iii. calculate the total mark
        int total = mark1 + mark2;
        
        // iv. display the total
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);
        
        // v. display a message based on the total
        if (total >= 160) {
            System.out.println("Result: Excellent");
        } else if (total >= 120) {
            System.out.println("Result: Good");
        } else {
            // Result calculation feature added
            System.out.println("Result: Needs Improvement");
        }
    }
    
}
