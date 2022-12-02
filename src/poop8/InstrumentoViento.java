/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *Clse Instrumento viento que hereda de Object implements InstrumentoMusical
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{
    
    @Override
    public void tocar(){
        System.out.println("Tocando instrumento de viento");
    }
    
    @Override
    public void afinar(){
        System.out.println("Afinando instrumento de viento");
    }
    
    /**
     * Método String
     * @return Regresa Intrumento de viento
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
}
