/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author MyPC
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
       String name;
       double a;
       double b;
        System.out.println("Hay nhap ten cua ban vao: \n");
       name = scanner.nextLine();
        System.out.println("Hi" + name);
        System.out.println("nhap so a:");
        a = scanner.nextDouble();
        System.out.println("nhap so b:");
        b = scanner.nextDouble();
        System.out.println("tong hai so la:" + (a+b) );
        System.out.println("hieu hai so la:" + (a-b));
        System.out.println("tich hai so la:" + (a*b) );
        System.out.println("thuong hai so la:" + (a/b));
        
        
       
    }
}
