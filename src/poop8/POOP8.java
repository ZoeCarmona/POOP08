/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *Clase principal
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Poligono poligono = new Poligono();
        
        Object objeto = poligono;
        System.out.println(objeto);
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        System.out.println(poligono);*/
        
        Poligono poligono = new Poligono() {
            @Override
            public float area() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public float perimetro() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        getPoligono(poligono);
        
        poligono = new Triangulo();
        getPoligono(poligono);
        
        poligono = new Cuadrilatero();
        getPoligono(poligono);
      
    }

    private static void getPoligono(Poligono p) {
        
        if (p instanceof Triangulo){
            System.out.println("\nEl objeto es un triángulo");
            System.out.println(p);
        }else{
            if (p instanceof Cuadrilatero){
                System.out.println("\nEl objeto es un cuadrilatero");
                System.out.println(p);
            }else{
                System.out.println("\nEl objeto es un polígono");
                System.out.println(p);
            }
        }
        
        
        /*Poligono poligono;
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);*/
        
        
        
        /*InstrumentoMusical instrumento;
        
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());*/
        
        /*System.out.println("El mes "+Meses.DOS+" corresponde a:");
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);*/
        
    }
    
}
