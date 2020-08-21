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

public class Streams implements Serializable {
    int id;
    String name;
    String school;
    String email;
    String phone;
    
    public Streams(int id, String name, String school, String email, String phone){
        this.id = id;
        this.name = name;
        this.school = school;
        this.email = email;
        this.phone = phone;
    }
}
