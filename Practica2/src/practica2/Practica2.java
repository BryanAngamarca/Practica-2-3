/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import controlador.tda.lista.exception.PosicionException;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import lista.ListaEnlazada;
import lista.ListaEnlazadaServices;
import org.github.jamm.*;

/**
 *
 * @author User
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PosicionException {
        MemoryMeter espacio = MemoryMeter.builder().build();

        String nuevs = "";
        double nuevdo = 0.0;
        Integer nuevoIr = 0;
        char nuevcha = ' ';
        short nuevsh = 0;
        long nuevlo = 0;
        float nuevfl;
        boolean nuebo;
        byte nuevby = 0;
        String arregloSt[] = new String[3];
        double Arreglodouble[] = new double[3];
        int ArregloIn[] = new int[3];
        char Arreglochar[] = new char[3];
        float Arreglofloat[] = new float[3];
        ListaEnlazadaServices lista = new ListaEnlazadaServices();
        ArrayList array = new ArrayList();
        System.out.println("Datos Vacios:\nString: " + espacio.measureDeep(nuevs) + " bits\nDouble: " + espacio.measureDeep(nuevdo)
                + " bits\nInteger: " + espacio.measureDeep(nuevoIr) + " bits\nChar: " + espacio.measureDeep(nuevcha)
                + " bits\nShort: " + espacio.measureDeep(nuevsh) + " bits\nLong: " + espacio.measureDeep(nuevlo)
                + " bits\nFloat: " + espacio.measureDeep(nuevsh) + " bits\nBoolean: " + espacio.measureDeep(nuevlo) + " bits\nByte: " + espacio.measureDeep(nuevby)+" bits");
        System.out.println("Arreglos Vacios:\nString: " + espacio.measureDeep(arregloSt) + " bits\nDouble: " + espacio.measureDeep(Arreglodouble)
                + " bits\nInt: " + espacio.measureDeep(ArregloIn) + " bits\nChar: " + espacio.measureDeep(Arreglochar) + " bits\nFloat: " + espacio.measureDeep(Arreglofloat)+" bits");
        System.out.println("Lista enlazada Vacía: " + espacio.measureDeep(lista) + " bits\nArrayList Vacío: " + espacio.measureDeep(array)+" bits");
        
        System.out.println("*******Llenado de los datos*********");
        nuevs = "Bryan";
        nuevdo= 4.5;
        nuevoIr=10;
        nuevcha='z';
        nuevsh = 50;
        nuevlo = 63;
        nuevfl=563;
        nuebo=false;
        nuevby = -55;
        //Nuevos arreglos con el mimo tamaño pero llenos
        String arregloSt1[] = {"Juan","Diego","María"};
        double Arreglodouble1[] = {0.3,5.3,9.6};
        int ArregloIn1[] = {96,56,12};
        char Arreglochar1[] = {'D','L','J'};
        float Arreglofloat1[] = {56,86,20};
        //Lenado de ListaEnlazada
        lista.insertarAlInicio("hola");
        lista.insertarAlInicio("casa");
        lista.insertarAlInicio("mascota");
        lista.insertarAlInicio("Lazy");
        lista.insertarAlInicio("Laila");
        lista.insertarAlInicio("Mesa");
        lista.insertarAlInicio("Perro");
        lista.insertarAlInicio("Cajón");
        lista.insertarAlInicio("Piso");
        lista.insertarAlInicio("Jose");
        lista.insertarAlInicio("Vaso");
        lista.insertarAlInicio("Parlante");
        lista.insertarAlInicio("Control");
        lista.insertarAlInicio("Meta");
        lista.insertarAlInicio("María");
        lista.insertarAlInicio("Santiago");
        lista.insertarAlInicio("Botella");
        lista.insertarAlInicio("Marta");
        lista.insertarAlInicio("Gabriela");
        lista.insertarAlInicio("Dayana");
        lista.insertarAlInicio("Pedro");
        lista.insertarAlInicio("Flor");
        lista.insertarAlInicio("teclado");
        lista.insertarAlInicio("raton");
        lista.insertarAlInicio("olla");
        //Lenado de ArrayList
        array.add("Dato1");
        array.add("Dato2");
        array.add("Dato3");
        array.add("Dato4");
        array.add("Dato5");
        array.add("Dato6");
        array.add("Dato7");
        array.add("Dato8");
        array.add("Dato9");
        array.add("Dato10");
        array.add("Dato11");
        array.add("Dato12");
        array.add("Dato13");
        array.add("Dato14");
        array.add("Dato15");
        array.add("Dato16");
        array.add("Dato17");
        array.add("Dato18");
        array.add("Dato19");
        array.add("Dato20");
        array.add("Dato21");
        array.add("Dato22");
        array.add("Dato23");
        array.add("Dato24");
        array.add("Dato25");
        System.out.println("");
        
        System.out.println("Datos Llenos:\nString: " + espacio.measureDeep(nuevs) + " bits\nDouble: " + espacio.measureDeep(nuevdo)
                + " bits\nInteger: " + espacio.measureDeep(nuevoIr) + " bits\nChar: " + espacio.measureDeep(nuevcha)
                + " bits\nShort: " + espacio.measureDeep(nuevsh) + " bits\nLong: " + espacio.measureDeep(nuevlo)
                + " bits\nFloat: " + espacio.measureDeep(nuevsh) + "bits\nBoolean: " + espacio.measureDeep(nuevlo) + " bits\nByte: " + espacio.measureDeep(nuevby)+" bits");
        System.out.println("Arreglos Llenos:\nString: " + espacio.measureDeep(arregloSt1) + " bits\nDouble: " + espacio.measureDeep(Arreglodouble1)
                + " bits\nInt: " + espacio.measureDeep(ArregloIn1) + " bits\nChar: " + espacio.measureDeep(Arreglochar1) + " bits\nFloat: " + espacio.measureDeep(Arreglofloat1)+" bits");
        System.out.println("Lista enlazada Llena: " + espacio.measureDeep(lista) + " bits\nArrayList Llena: " + espacio.measureDeep(array)+ " bits");
        
    }

}
