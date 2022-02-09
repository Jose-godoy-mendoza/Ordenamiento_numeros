/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadordenumeros;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author joseg
 */
public class GeneradorDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Set<Integer> lista_numeros = new HashSet<Integer>();
        /*ArrayList<Integer> lista_numeros = new ArrayList<>();
        while(lista_numeros.size()<1000000)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
            lista_numeros.add(random);
        }
        System.out.println("Hay: "+lista_numeros.size()+" numeros en el array");
        Archivo.Guardar_como(lista_numeros);*/
        Archivo.Ordenar();
    }
    
}
