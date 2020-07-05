/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import static java.lang.System.in;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
import static sun.java2d.cmm.ColorTransform.In;

/**
 *
 * @author ASUS
 */
public class Input_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama=" ";
        String jurusan=" ";       
        int nim =0;
        int semester=0;
        double ipk=0;
        //Membuat Sanner
        
        System.out.println("###Pendataan KRS Mahasiswa###");
        Scanner inputUser= new Scanner(System.in);
        System.out.println("Siapa nama anda?");
        nama=inputUser.nextLine();
        System.out.println("Apakah jurusan anda?");
        jurusan=inputUser.nextLine();
        System.out.println("masukkan nomer nim anda?");
        nim =inputUser.nextInt();
        System.out.println("semester berapa anda?");
        semester =inputUser.nextInt();
        System.out.println("Berapa ipk terakhir anda?");
        ipk =inputUser.nextDouble();
        //Output
        System.out.println ("=========");
        System.out.println ("nama anda adalah:"+" "+nama);
        System.out.println ("Jurusan anda sekarang adalah"+" "+jurusan);
        System.out.println ("nomer nim adalah"+" "+nim);
        System.out.println ("semester anda adalah"+" "+semester);
        System.out.println ("ipk terakhir anda adalah"+" "+ipk);
    };
    
}
