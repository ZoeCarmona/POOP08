/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *Clase abstracta Poligono
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public abstract class Poligono {
    /**
     * Método abstracto del area
     * @return Regresa el area 
     */
    public abstract float area();
    
    /**
     * Método abstracto del perimetro
     * @return Regresa el perimetro
     */
    public abstract float perimetro();
    
    /**
     * Método toStrig
     * @return Regresa Poligono
     */
    @Override
    public String toString(){
        return "Poligono";
    }
}
