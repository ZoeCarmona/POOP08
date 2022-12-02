/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *Clase Triangulo que hereda de Poligono
 * @author Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
 */
public class Triangulo extends Poligono{
    
    private int alpha, beta, gamma;
    private float a, b, c, base, altura;
    
    /**
     * Constructor vacio
     */
    public Triangulo() {
    }

    /**
     * Constructor lleno
     * @param alfa Angulo del triangulo
     * @param beta Angulo del triangulo
     * @param gama Angulo del triangulo
     * @param a Lado a del triangulo
     * @param b Lado b del triangulo
     * @param c Lado c del triangulo
     * @param base Base del triangulo
     * @param altura Altura del triangulo
     */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float altura) {
        this.alpha = alfa;
        this.beta = beta;
        this.gamma = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene el angulo alpha
     * @return Regresa alpha
     */
    public int getAlfa() {
        return alpha;
    }

    /**
     * Almacena el valor de alfa
     * @param alfa Angulo del triangulo
     */
    public void setAlfa(int alfa) {
        this.alpha = alfa;
    }

    /**
     * Obtiene el angulo beta
     * @return Regresa beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Almacena el valor de beta
     * @param beta Angulo del triangulo
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Obtiene el angulo gamma
     * @return Regresa gamma
     */
    public int getGama() {
        return gamma;
    }

    /**
     * Almacena el valor de gamma
     * @param gama Angulo del triangulo
     */
    public void setGama(int gama) {
        this.gamma = gama;
    }

    /**
     * Obtiene valor del lado a
     * @return Regresa a
     */
    public float getA() {
        return a;
    }

    /**
     * Almacena valor de a
     * @param a Lado a del triangulo
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene el valor de b
     * @return Regresa b
     */
    public float getB() {
        return b;
    }

    /**
     * Almacena valor de b
     * @param b Lado b del triangulo
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene valor del lado c
     * @return Regresa c
     */
    public float getC() {
        return c;
    }

    /**
     * Almacena valor del lado c
     * @param c Lado c del triangulo
     */
    public void setC(float c) {
        this.c = c;
    }
    
    /**
     * Obtiene la base del triangulo
     * @return Regresa base
     */
    public float getBase() {
        return base;
    }

    /**
     * Almacena la base del triangulo
     * @param base Base del triangulo
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del triangulo
     * @return Regresa altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Almacena la altura
     * @param altura Altura del triangulo
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Método flotante qpara obtener el area del triangulo
     * @return Regresa el area (multiplica base x altura y lo divide entre 2)
     */
    @Override
    public float area(){
        return (base*altura)/2;
    }
    
    /**
     * Método flotante que obtiene el perimetro
     * @return Regresa perimetro (suma todos sus lados)
     */
    @Override
    public float perimetro(){
        return a+b+c;
    }
    
    /**
     * Imprime valores de aplha, beta, gamma, a, b,c, base y altura del triangulo
     * @return Regresa valores de aplha, beta, gamma, a, b,c, base y altura del triangulo
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
