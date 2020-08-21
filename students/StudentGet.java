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

public class StudentGet {
   public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your ID: ");
       int oid = sc.nextInt();
       System.out.println("Enter Your Passcode: ");
       int pass = sc.nextInt();
       try{
        ObjectInputStream in1 = new ObjectInputStream(new 
            FileInputStream(oid+".txt"));
        Officer officer1 = (Officer)in1.readObject(); 
        int correctPass = officer1.passcode;
        if(pass == correctPass){
            System.out.println("Welcome: " + officer1.name);
            System.out.println("Enter Student ID: ");
            int id = sc.nextInt();
            try{
             ObjectInputStream in2 = new ObjectInputStream(new 
                    FileInputStream(id+".txt"));
             Student student1 = (Student)in2.readObject();
             System.out.println("Student Name: " + student1.id);
             System.out.println("Student ID: " + student1.name);
             System.out.println("Student Email: " + student1.email);
             System.out.println("Student Phone Number: " 
                     + student1.phone);
             System.out.println("Student Phone Town: " + student1.town);
             System.out.println("Student Phone Postcode: " 
                     + student1.postcode);
             System.out.println("Student Phone Average Grade: " 
                     + student1.averageGrade);
             in2.close();
            } catch(FileNotFoundException e){
                // e.printStackTrace();
                System.out.println("Student with that ID does not exist!");
            }
        } else {
            System.out.println("Your passcode is incorrect!");
        }
        in1.close();
       } catch(FileNotFoundException e){
//           e.printStackTrace();
           System.out.println("Officer with that ID does not exist!");
       } 
   } 
}