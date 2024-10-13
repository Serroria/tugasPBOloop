/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dua;

/**
 *
 * @author meryl
 */
public class tabelPerkalian {
    public static void main(String[] args) {
    int n = 4; 
       
    System.out.print("\t"); 
    for (int j = 1; j <= n; j++) {
         System.out.print(j + "\t"); 
        }
    System.out.println(); 

        
    for (int i = 1; i <= n; i++) {
    System.out.print(i + "\t"); 

        for (int j = 1; j <= n; j++) {
            System.out.print((i * j) + "\t"); 
            }
        System.out.println(); 
        }
    }
}

