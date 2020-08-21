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

public class Student implements Serializable {
    int id;
    String name;
    String school;
    String email;
    String phone;
    String town;
    String postcode;
    double averageGrade;
    
    public Student(int id, String name, String school, String email, 
            String phone,String town, String postcode, double averageGrade){
        this.id = id;
        this.name = name;
        this.school = school;
        this.email = email;
        this.phone = phone;
        this.town = town;
        this.postcode = postcode;
        this.averageGrade = averageGrade;
    }
}