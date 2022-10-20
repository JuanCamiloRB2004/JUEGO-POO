/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELOS;

/**
 *
 * @author Administrador
 */
public class Jugador extends Base{
    int numeroVidas;

    public Jugador(int x, int y, int tamaño, String url, int numeroVidas) {
        super(x, y, tamaño, url);
        this.numeroVidas = numeroVidas;
    }

    public Jugador() {
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public void moverAR(){
        
    }
    
    public void moverAB(){
        
    }
    
    public void moverDE(){
        
    }
    
    public void moverIZ(){
        
    }
}
