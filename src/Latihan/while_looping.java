/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class while_looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 boolean running =true;
    int counter =0;
    String jawab1;
    Scanner scan=new Scanner (System.in);
    
    while (running){
        System.out.println("Berapa hasil dari 1+2 ?");
        jawab1=scan.nextLine ();
    if (jawab1.equalsIgnoreCase("3")){
        running=false;
    }
    counter++;
    }
    System.out.println("anda sudah menjawab sebanyak"+" "+counter+" "+"kali");
    System.out.println("Jawaban anda sudah BENAR");
    boolean running2 =true;
    int counter2 =0;
    String jawab2;
    Scanner scan2=new Scanner (System.in);
    

    }
    
}
