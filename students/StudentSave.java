/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author admin
 */

import java.io.*;
import java.util.Scanner;

public class StudentSave {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String idnumber = sc.nextLine();
        int id = Integer.parseInt(idnumber);
        System.out.println("Enter  Name: ");
        String name = sc.nextLine();
        System.out.println("Enter School Name: ");
        String school = sc.nextLine();
        System.out.println("Enter Email Address: ");
        String email = sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.println("Enter Town Name: ");
        String town = sc.nextLine();
        System.out.println("Enter Post Code: ");
        String postcode = sc.nextLine();
        System.out.println("Enter Average Grade - 0 if not available: ");
        double averageGrade = sc.nextDouble();
   
        Student student1 = new Student(id, name, school, email, phone, 
                town, postcode, averageGrade);
        FileOutputStream fout1 = new FileOutputStream(id+".txt");
        ObjectOutputStream out1 = new ObjectOutputStream(fout1);
        out1.writeObject(student1);
        out1.flush();
        System.out.println("Student Saved Successfully to File: " 
                + id + ".txt");
    }
}