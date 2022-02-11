/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadordenumeros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author joseg
 */

public class Archivo {
    public static void Guardar_como() throws IOException {
        ArrayList<Integer> lista_numeros = new ArrayList<>();
        while(lista_numeros.size()<1000000)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
            lista_numeros.add(random);
        }
        //System.out.println("Hay: "+lista_numeros.size()+" numeros en el array");
        
        String fichero = "numeros.txt";
 
        try {
            File archivo= new File(fichero);
            FileWriter escribir= new FileWriter(archivo,true);
            PrintWriter imprimir=new PrintWriter(escribir);   
            imprimir.print(lista_numeros);
            imprimir.close();
            System.out.println("Pacientes guardados correctamente...");
 
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: El fichero no existe. ");
        }
 
    }
    
    public static void Ordenar() throws IOException
    {
        /*List <String> orden = new ArrayList<String>();
        String orden2[];
        try{
            String salida = null;
            BufferedReader Lectura = new BufferedReader(new FileReader("prueba.txt"));
            

            String linea = Lectura.readLine(); 
            while(linea!=null)
            {
                orden.add(linea);
                linea=Lectura.readLine();
            }
            ArrayList<Integer> resultado = getIntegerArray(orden);
            orden2=orden.toArray(new String [orden.size()]);
            //Arrays.sort(orden2);
            Collections.sort(orden);
            
        System.out.print(orden);
        //System.out.print(Arrays.toString(orden2));
        }catch(FileNotFoundException e){
            System.out.println("El Archivo solicitado no ha sido encontrado" + e.getMessage());
        }catch(IOException IOe){
            System.out.println("El Archivo solicitado no se pudo abrir o cerrar" + IOe.getMessage());
        }*/
        File archivo = new File("Ordenados.txt");
        archivo.createNewFile();
        
        ArrayList<String> lineas = new ArrayList<>();
        Scanner leer = new Scanner(new File("numeros.txt")).useDelimiter(",");
        while(leer.hasNext())
        {
            lineas.add(leer.next());
        }

        ArrayList<Integer> resultado = Pasar_Arr_Int(lineas);
        Collections.sort(resultado);

        //List<Integer> listOfInteger = lineas.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        
        
            FileWriter escribir = new FileWriter(archivo);
            PrintWriter imprimir=new PrintWriter(escribir);   
            imprimir.print(resultado);
            imprimir.close();
    }
    
    public static ArrayList<Integer> Pasar_Arr_Int(ArrayList<String>numeros){
        ArrayList<Integer> Convertir = new ArrayList<Integer>();
        for(String stringValue : numeros){
            try{
                Convertir.add(Integer.parseInt(stringValue.trim()));
            }catch (Exception ex) {
            }
        }
        return Convertir;
    }
}
