/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class input_joptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("###Ulangan Matematika###");
  String nama =JOptionPane.showInputDialog ("siapa nama anda?");
        JOptionPane .showMessageDialog(null,"nama anda adalah"+" "+nama);
        
  String jurusan =JOptionPane.showInputDialog ("apa jurusan apa?");
        JOptionPane.showMessageDialog(null,"Jurusan anda adalah"+" "+jurusan);
        
  int umur =Integer.parseInt(JOptionPane.showInputDialog("Berapa Nim anda?"));
        JOptionPane.showMessageDialog(null,"Nim anda adalah"+" "+umur);      
   
  Double latihan1 =Double.parseDouble
        (JOptionPane.showInputDialog ("berapa hasil dari 50-100 =?"));
    JOptionPane.showMessageDialog(null,"Hasilnya adalah"+" "+latihan1);
    
    Double latihan2 =Double.parseDouble
        (JOptionPane.showInputDialog ("Berapa hasil dari 20-30=?"));
    JOptionPane.showMessageDialog(null,"Hasilnya adalah"+" "+latihan2);
    }
    
}
