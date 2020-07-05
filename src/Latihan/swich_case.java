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
public class swich_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("=====================================");
         System.out.println("=====================================");
         System.out.println("===========Form Pembelihan===========");
         System.out.println("=====================================");
         System.out.println("=====================================");

String pilih;
String warna;
String mode;

Scanner scan =new Scanner (System.in);
//Pilihan 1
System.out.println("Masukkan Pilihan Pembelihan(Baju/Sepatu)");
pilih=scan.nextLine();
switch(pilih){
        
    case "baju":
    System.out.println ("Anda Membeli Baju");
    System.out.println("=====================================");
    break;
    case "sepatu":
    System.out.println ("Anda membeli Sepatu");
    System.out.println("=====================================");
    break;
    default:
    System.out.println("Anda tidak membeli keduanya");
    System.out.println("=====================================");
    }
//Pilihan 3
System.out.println("Apa warna Baju/Sepatu anda?(hitam/putih)");
warna=scan.nextLine();
switch(warna){
        
    case "hitam":
    System.out.println ("Anda Membeli barang warna hitam");
    System.out.println("=====================================");
    break;
    case "putih":
    System.out.println ("Anda Membeli barang warna putih");
    System.out.println("=====================================");
    break;
    default:
    System.out.println("Anda tidak membeli keduanya");
    System.out.println("=====================================");
    }
System.out.println("Masukkan Pilihan Pembelihan Baju/Sepatu(Kredit/cash)");
mode=scan.nextLine();
switch(mode){
        
    case "cash":
    System.out.println ("Anda Menbeli barang dengan cash");
    System.out.println("=====================================");
    break;
    case "kredit":
    System.out.println ("Anda Mengkredit barang");
    System.out.println("=====================================");
    break;
    default:
    System.out.println("Anda tidak membeli keduanya");
    System.out.println("=====================================");
    
    }
}
}
