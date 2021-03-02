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
public class lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ta co PT bac nhat: ax + b = 0");
        System.out.println("Hay nhap he so a va b:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        float c = -b/a;
        System.out.println("Nghiem cua PT la: x = " + c);
               
    }
}
