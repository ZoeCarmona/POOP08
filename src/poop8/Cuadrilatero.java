/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *Clase Cuadrilatero que hereda de Poligono
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class Cuadrilatero extends Poligono{
    
    private int alpha, beta;
    private float a,b, base=12, altura=18;

    /**
     * Constructor vacio
     */
    
    public Cuadrilatero() {
    }

    /**
     * Constructor lleno
     * @param alfa Angulo del cuadrilatero
     * @param beta Angulo del cuadrilatero
     * @param a Lado a de un cuadrilatero
     * @param b Lado b de un cuadrilatero
     * @param base Base del cuadrilatero
     * @param altura Altura del cuadrilatero
     */
    
    public Cuadrilatero(int alfa, int beta, float a, float b, float base, float altura) {
        this.alpha = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene alpha
     * @return Regresa alpha
     */
    
    public int getAlfa() {
        return alpha;
    }

    /**
     * Almacena alpha
     * @param alfa Angulo del cuadrilatero
     */
    public void setAlfa(int alfa) {
        this.alpha = alfa;
    }

    /**
     * Obtiene Beta
     * @return Regresa Beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Almacena Beta
     * @param beta Anfulo del cuadrilatero
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Método flotante que obtiene lado a
     * @return Regresa lado a
     */
    public float getA() {
        return a;
    }
    
    /**
     * Almacena lado a
     * @param a Lado de un cuadrilatero
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Método flotante que obtiene lado b
     * @return Regresa lado b
     */
    public float getB() {
        return b;
    }

    /**
     * Almacena lado b
     * @param b Lado b de un cuadrilatero
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Método flotante que obtiene la base de un cuadrilatero
     * @return Regresa la base
     */
    public float getBase() {
        return base;
    }

    /**
     * Almacena la base
     * @param base Base de un cuadrilatero
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Método flotante que obtiene la altura
     * @return Regresa la altura 
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Almacena la altura
     * @param altura Altura de un cuadrilatero
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    /**Método flotante que obtiene el área de un cuadrilatero
     * @return Regresa el área del cuadrilatero (multiplica base y altura)
     */
    public float area(){
        return base*altura;
    }
    
    /**
     * Método flotante que obtiene el perimetro de un cuadrilatero
     * @return Regresa el perimetro de un cuadrilatero (suma todos sus lados)
     */
    @Override
    public float perimetro(){
        return (2*a)+(2*b);
    }
    
    /**
     * Imprime valores de aplha, beta, a, b,base y altura del cuadrilatero
     * @return Regresa valores de aplha, beta, a, b,base y altura del cuadrilatero
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}
