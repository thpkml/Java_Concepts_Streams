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
import java.util.NoSuchElementException;
public class OfficerSave {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String idnumber = sc.nextLine();
        int id = Integer.parseInt(idnumber);
        System.out.println("Enter  Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Email Address: ");
        String email = sc.nextLine();
        System.out.println("Enter Passcode: ");
        int passcode = sc.nextInt();

        Officer officer1 = new Officer(id, name, email, passcode);
        FileOutputStream fout1 = new FileOutputStream(id+".txt");
        ObjectOutputStream out1 = new ObjectOutputStream(fout1);
        out1.writeObject(officer1);
        out1.flush();
        System.out.println("Officer Saved Successfully to File: " 
                + id + ".txt");
    }
}