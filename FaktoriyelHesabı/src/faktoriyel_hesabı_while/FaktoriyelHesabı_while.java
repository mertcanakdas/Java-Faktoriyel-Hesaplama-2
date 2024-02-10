/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faktoriyel_hesabı_while;

import java.util.Scanner;



/**
 *
 * @author dell
 */
public class FaktoriyelHesabı_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
       System.out.println("hesaplanacak sayıyı giriniz:");
      int hs =s.nextInt();
      int fak=1;
      int sbt=1;
      while(sbt<=hs){
          fak=fak*sbt;
          sbt++;
      } System.out.println(hs+"!="+fak);
                
    }
    
}
