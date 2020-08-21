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
import java.util.Scanner;
import java.text.DecimalFormat;

public class FormatDemo {
    static Scanner sc = new Scanner(System.in);
    
    public static String getName(){
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        return name;
    }
    public static double getHours(){
        System.out.println("Enter hours worked: ");
        double hours = sc.nextDouble();
        return hours;
    }
    public static double getRate(){
        System.out.println("Enter pay rate: ");
        double rate = sc.nextDouble();
        return rate;
    }
    public static double getTax(){
        System.out.println("Enter tax rate in percentage: ");
        double tax = sc.nextDouble();
        sc.close();
        return tax;
    }
//    Calculate gross pay
    public static double  grossPay(double h, double r){
        double gross = h * r;
        return gross;
    }
//   Calculate net pay
    public static double netPay(double h, double r, double t){
        double net = h * r * (1 - t/100);
        return net; 
    }
//    Display the information as a payslip
    public static void displayPayslip(String n, double h, double r, double t, 
            double g, double nt){
        DecimalFormat df = new DecimalFormat("0000.00");
        System.out.println("============================");
        System.out.println("Employee: " + n);
        System.out.println("============================");
        
        df = new DecimalFormat("00.00");
        System.out.println("Hours worked: " + h);
        
        df = new DecimalFormat("£00.00");
        System.out.println("Pay rate: " + df.format(r));
        
        df = new DecimalFormat("00.00");
        System.out.println("Tax rate: " + df.format(t));
        
        df = new DecimalFormat("£0000.00");
        System.out.println("Gross pay: " + df.format(g));
        
        df = new DecimalFormat("£0000.00");
        System.out.println("============================");
        System.out.println("Net pay: " + df.format(nt));
        System.out.println("============================");
    }
    
    public static void main(String[] args){
        String n = getName();
        double h = getHours();
        double r = getRate();
        double t = getTax();
        double g = grossPay(h, r);
        double nt = netPay(h, r, t);
        
        displayPayslip(n, h, r, t, g, nt);
        
    }
}