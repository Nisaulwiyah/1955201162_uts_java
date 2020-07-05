/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author ASUS
 */
public class input_BufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nama=" ";
        String jurusan=" ";
        int umur;
        int semester;
        double ipk;
        //Input StreamReader
        InputStreamReader isr=new InputStreamReader(System.in);
        //Object BufferedReader
        BufferedReader br =new BufferedReader (isr);
        // //Mengisi variabel nama dengan BufferedReader
       System.out.println("###Pendataan Mahasiswa Mengikuti Skripsi###");
       System.out.println("Siapa Nama Anda?");
         nama=br.readLine();
       System.out.println("Apa jurusan anda?");
         jurusan=br.readLine();
       System.out.println("Semester berapakah anda?");
        semester = Integer.parseInt(br.readLine());
        System.out.println("Berapa umur anda?");
        umur = Integer.parseInt(br.readLine());
       System.out.println("Berapakah ipk terakhir anda?");
        ipk = Double.parseDouble(br.readLine());
       //Menampilkan nama
       System.out.println("Nama Anda Adalah"+" "+nama);
       System.out.println("Jurusan anda adalah"+" "+jurusan);
       System.out.println("semester anda adalah"+" "+semester);
       System.out.println("umur anda adalah"+" "+umur+" "+"tahun");
       System.out.println("ipk terakhir anda adalah"+" "+ipk);
      
        
    }
}
