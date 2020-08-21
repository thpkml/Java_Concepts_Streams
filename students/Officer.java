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
public class Officer implements Serializable {
    int id;
    String name;
    String email;
    int passcode;
    
    public Officer(int id, String name, String email, int passcode){
        this.id = id;
        this.name = name;
        this.email = email;
        this.passcode = passcode;
    }
}