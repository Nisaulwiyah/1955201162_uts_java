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
public class If_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("+==============+");
    System.out.println("+==============+");
             System.out.println("Latihan Soal Ips"); 
    System.out.println("+==============+");
    System.out.println("+==============+");
        String negara;
        String kota;
        int nilai = 0;
        int prov=0;
        
//Pertanyaan 1       
System.out.println("Apa nama Negaramu?");
Scanner inputUser=new Scanner (System.in);
System.out.print("Jawaban: ");
       negara=inputUser.nextLine();
        if ("indonesia".equals(negara)){
    System.out.println ("Jawaban Anda BENAR");
}else{
    System.out.println ("Jawaban Anda SALAH");
    
}
System.out.println("+========================+");
//Pertayaan ke 2
System.out.println("Dimanakah ibu kota Indonesia?");
System.out.print("Jawaban: ");
        kota=inputUser.nextLine();
        if ("jakarta".equals(kota)){
            System.out.println ("Jawaban Anda BENAR");
}else{
            System.out.println ("Jawaban Anda SALAH");
}
System.out.println("+========================+"); 

//Pertanyaan ke 3
System.out.println("Berapakah Jumlah Provinsi di indonesia?(34/35)");
System.out.print("Jawaban: ");
      nilai=inputUser.nextInt();
      
    if (nilai<=34)
{
    System.out.println ("Jawaban Anda BENAR");
}else{
    System.out.println ("Jawaban Anda SALAH");
}
System.out.println("+========================+");

//Pertanyaan ke 4
System.out.println("Berapakah Jumlah Provinsi di Pulau jawa?(5/6)");
System.out.print("Jawaban: ");
      prov=inputUser.nextInt();
      
    if (prov>=6)
{
    System.out.println ("Jawaban Anda BENAR");
}else{
    System.out.println ("Jawaban Anda SALAH");
}
System.out.println("+========================+");

        }
    }
    
