/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.*;

public class Zad4 {
    
    public static void main(String[] args) {
        
        HashMap <String,String> slownik = new HashMap <String,String>();
        
        slownik.put("pies", "dog");
        slownik.put("kot", "cat");
        slownik.put("zolw", "turtle");
        slownik.put("slon", "elephant");
        slownik.put("tygrys", "tiger");
        slownik.put("pingwin", "pinguin");
        slownik.put("malpa", "monkey");
        slownik.put("szczur", "rat");
        slownik.put("papuga", "parrot");
        slownik.put("kurczak", "chicken");
        slownik.put("owca", "sheep");
        slownik.put("kon", "horse");
        slownik.put("waz", "snake");
        slownik.put("pszczola", "bee");
        slownik.put("kaczka", "duck");
        slownik.put("ryba", "fish");
        slownik.put("lis", "fox");
        slownik.put("sowa", "owl");
        slownik.put("motyl", "butterfly");
        slownik.put("pajak", "spider");
        
        Scanner input = new Scanner(System.in);
        String word;
        do{
            System.out.println("Podaj slowo ktore zostanie przetlumaczone: ");
            word = input.next();
            System.out.println("Podane slowo: "+word+", podane slowo po angielsku: "+slownik.get(word));
        }while(!word.equals("koniec!"));
        
    }
    
}
