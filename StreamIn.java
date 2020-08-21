/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

/**
 *
 * @author admin
 */

import java.io.*;

public class StreamIn {
   public static void main(String[] args) throws Exception{
       ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("file1.txt"));
       
       Streams student1 = (Streams)in1.readObject();
       
       System.out.println("Student Name: " + student1.id);
       System.out.println("Student ID: " + student1.name);
       System.out.println("Student Email: " + student1.email);
       System.out.println("Student Phone Number: " + student1.phone);
       in1.close();
   } 
}