/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         System.out.println("=====================================");
         System.out.println("||    ###SIMULASI UAS ONLINE###    ||");
         System.out.println("||    =========================    ||");
         System.out.println("=====================================");
  //JoptionPane//
        String siap =JOptionPane.showInputDialog("Apakah anda sudah siap mengikuti ujian?");
         JOptionPane.showMessageDialog(null,"Ok! Anda siap mengikuti ujian");
  //BufferedReader//       
    String nama=" ";
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader (isr);
        System.out.print("Siapa Nama Anda?");
        nama=br.readLine();
  //Scanner
    int nim =0;
        Scanner inputUser= new Scanner(System.in);
        System.out.print("masukkan NIM anda?");
        nim =inputUser.nextInt();
        System.out.println("*************************************");
               System.out.println("Nama Anda Adalah"+" "+nama);
               System.out.println ("Nomer Nim anda adalah"+" "+nim);
        System.out.println("*************************************");
  //Looping For
  for (int i=0; i <= 2; i++){
  System.out.println("###Siapkan diri anda untuk pertanyaan pertama!!###");
    }
        System.out.println("=====================================");
    //Looping While
  boolean running =true;
    int counter =0;
    String jawab1;
    Scanner scan=new Scanner (System.in);
    
    while (running){
        System.out.println("1.Berapakah hasil dari 1000:5?");
        jawab1=scan.nextLine ();
    if (jawab1.equalsIgnoreCase("200")){
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
    
    while (running2){
        System.out.println("2.Berapakah hasil dari 1000:200?");
        jawab2 =scan2.nextLine ();
    if (jawab2.equalsIgnoreCase("5")){
        running2=false;
    }
    counter2++;
    }
    System.out.println("anda sudah menjawab sebanyak"+" "+counter2+" "+"kali");
    System.out.println("Jawaban anda sudah BENAR");
    System.out.println("=====================================");
    //Looping do while
    int i =1;
    do {
        System.out.println("Menyimpan jawaban ke-"+i++);
    }
    while (i<=2);
    System.out.println("=====================================");
    //Decision if else
    System.out.println("Nilai diambil dari setiap nomor yang benar bernilai 50");
      int nil = 0;
      
      Scanner Scan =new Scanner (System.in);
      System.out.print("Nilai: ");
      nil=scan.nextInt();
      
if (nil >=50){
    System.out.println ("selamat anda LULUS");
}else{
    System.out.println ("Anda tidak LULUS");
}
System.out.println("=====================================");
//Decision Swich Case
String hasil;
Scanner scan3=new Scanner (System.in);
System.out.println("Masukkan hasil(LULUS/TIDAK LULUS:)");
hasil=scan3.nextLine();
switch(hasil){
        
    case "lulus":
        System.out.println("=====================================");
        System.out.println("=====================================");
    System.out.println ("LULUS,SELAMAT ANDA NAIK TINGKAT");
        System.out.println("=====================================");
        System.out.println("=====================================");
    break;
    case "tidak lulus":
        System.out.println("=====================================");
        System.out.println("=====================================");
    System.out.println ("TIDAK LULUS,ANDA MENGULANG LAGI");
        System.out.println("=====================================");
        System.out.println("=====================================");
    break;
    default:
    System.out.println("ANDA MEMASUKKAN DATA YANG SALAH");
    System.out.println("=====================================");
}
    }
}




    
    
        

    
    

