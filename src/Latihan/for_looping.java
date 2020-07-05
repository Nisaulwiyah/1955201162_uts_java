/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class for_looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=3;
        String baju= " ";
        System.out.println("Mulai");
        System.out.println("Siapkan baju");
        System.out.println("ganti baju"); 
        
        baju="ganti";
        System.out.println("Apakah baju sudah ganti?");
       if ("ganti".equals (baju))
       {
           System.out.println("sudah ganti");
       }
        else{
                System.out.println("belum ganti");             
       }
        
for (int i= 1;i< n; i++){
  System.out.println("###Baju sudah diganti!!###");
    }
        System.out.println("Baju sudah bersih");
        System.out.println("selesai");
    }
    
}
