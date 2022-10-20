/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELOS;

/**
 *
 * @author Administrador
 */
public class Asteroide extends Base{
    private boolean activo;
    private int direccion;

    public Asteroide(int x, int y, int tamaño, String url, boolean activo, int direccion) {
        super(x, y, tamaño, url);
        this.activo = activo;
        this.direccion = direccion;
    }

    public Asteroide() {
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    
    //mover los asteroides dependiendo de donde se halla creado hasta el extremo contrario de la pantalla donde desaparecera despues de llegar al limite
    public void mover(){
        if(this.direccion == 0){
            for(int i = 0; i <= 700; i++) {
                y = getY()+1;
            }
            setActivo(false);
        } else if(this.direccion == 1){
            for(int i = 700; i >= 0; i--) {
                x = getX()+1;
            }
            setActivo(false);
        } else if(this.direccion == 2){
            for(int i = 700; i >= 0; i--) {
                y = getY()+1;
            }
            setActivo(false);
        } else if(this.direccion == 3){
            for(int i = 0; i <= 700; i++) {
                x = getX()+1;
            }
            setActivo(false);
        } else {
            
        }
    }
}
