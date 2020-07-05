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
public class dowhile_looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n =1;
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
        int i =1;
    do {
        System.out.println("Ganti baju ke-"+i++);
    }
    while (i<5);
    System.out.println("Selesai");
    System.out.println("=====================================");
    }
    
}
