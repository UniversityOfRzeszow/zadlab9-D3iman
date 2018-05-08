/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.*;

public class Zad1 {

    public static void main(String[] args) {
        
        int tab[] = new int[100];
        Random r = new Random();
        
        for(int i = 0; i < tab.length; i++){
            tab[i] = r.nextInt(51);
        }
        System.out.println("Wylosowano 100 liczb.");
        
        Arrays.sort(tab);
        System.out.println("Sortowanie i wyswietlanie tablicy: ");
        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }
    
}
