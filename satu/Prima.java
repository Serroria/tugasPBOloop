/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satu;

/**
 *
 * @author meryl
 */
public class Prima {
    public static void main(String[] args) {
   int i = 2;
  
   
   while ( i < 20){
       boolean prima = true;
       int j = 2;
       while ( j<= i/2){
           if ( i % j == 0){
               prima = false;
                System.out.println(i + " bukan bilangan prima");
               break;
           } 
           j++;
         
       }
       if (prima) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " BUKAN bilangan prima");
            }

             i++;
    }
}
}
