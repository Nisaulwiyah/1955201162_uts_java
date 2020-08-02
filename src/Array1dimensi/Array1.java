/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array1dimensi;

import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Array1 {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String Nama[]=new String[5];
          for(int i=1; i<Nama.length;i++){
         Nama[i]=JOptionPane.showInputDialog(null,"inputkan nama mahaiswa"+i);
         System.out.println(Nama[i]);
          }
             String Cari = JOptionPane.showInputDialog(null,"cari nama mahasiswa");
     for (int i=1; i<Nama.length;i++ ){
   if (Nama[i].equals(Cari)){
      JOptionPane.showMessageDialog(null,"nama yang anda cari adalah"+Cari+"ketemu pada index ke "+i);
}
}
}
}