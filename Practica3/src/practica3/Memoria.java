/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Memoria {
    public final static int OVERFLOW = 200000000;
    private String salida;
    private int tamanio;
    String tempOOM = "";

    public Memoria(int leng) {
        this.tamanio = leng;
        int i = 0;
         StringBuilder stringb = new StringBuilder(OVERFLOW);
        while (i < leng) {
            i++;
            try {         
                stringb.append("a");
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
        this.salida= stringb.toString();
        this.salida = tempOOM.toString();
    }

    public String getOom() {
        return salida;
    }

    public int getLength() {
        return tamanio;
    }

    public static void main(String[] args) {
        Memoria javaHeapTest = new Memoria(OVERFLOW);
        System.out.println(javaHeapTest.getOom().length());
        Scanner sc = new Scanner(System.in);
        System.out.println("presione cualquier número");
        sc.nextInt();
    }
}
