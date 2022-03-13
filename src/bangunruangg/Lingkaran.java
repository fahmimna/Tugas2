/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangg;

/**
 *
 * @author HP
 */
public class Lingkaran implements MenghitungBidang{
    private double jariJari;

    public Lingkaran(double jari) {
        this.jariJari = jari;
    }
    public double getJari(){
        return jariJari;
    }
    public void setJari(double jari){
    this.jariJari = jari;
    }
    
    @Override
    public double luas() {
    return 3.14*jariJari*jariJari;
    }

    @Override
    public double keliling() {
    return 2*jariJari*3.14;
    }

 
}