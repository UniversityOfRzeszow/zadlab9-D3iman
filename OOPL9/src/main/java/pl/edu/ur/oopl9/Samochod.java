/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Samochod {
    
    private String marka;
    private String nazwa_samochodu;
    private int max_predkosc;
    private int cena;

    public Samochod(String marka, String nazwa_samochodu, int max_predkosc, int cena) {
        if(marka!="")
            this.marka = marka;
        else
            this.marka = "";
        if(nazwa_samochodu!="")
            this.nazwa_samochodu = nazwa_samochodu;
        else
            this.nazwa_samochodu = "";
        if(max_predkosc>0)
            this.max_predkosc = max_predkosc;
        else
            this.max_predkosc = 0;
        if(cena>0)
            this.cena = cena;
        else
            this.cena = 0;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa_samochodu() {
        return nazwa_samochodu;
    }

    public void setNazwa_samochodu(String nazwa_samochodu) {
        this.nazwa_samochodu = nazwa_samochodu;
    }

    public int getMax_predkosc() {
        return max_predkosc;
    }

    public void setMax_predkosc(int max_predkosc) {
        this.max_predkosc = max_predkosc;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    
    @Override
    public String toString(){
        return " Marka: "+marka+"  Nazwa samochodu: "+nazwa_samochodu+"  Maksymalna predkosc: "+max_predkosc+"  Cena: "+cena;
    }
    
    
}
