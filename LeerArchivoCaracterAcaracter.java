package com.fernandogarcia.fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoCaracterAcaracter {

    public static void main(String[] args)throws IOException {

        LeerFichTexto1();
    }

    //------------------Lee caracter a caracter-----read()--------------------
    public static void LeerFichTexto1()throws IOException{

        //No olvidar las dobles \\ en la ruta para Windows
        File fichero = new File("./fichero.txt");
        //declarar fichero

        FileReader fic=null;

        try{

            fic = new FileReader(fichero);
            //crear el flujo de entrada

            int i;

            //Nos lee caracter a caracter
            while ((i = fic.read()) != -1){

                System.out.print((char) i );
                //System.out.println((char) i + "==>" + i);
            }
        }

        catch(FileNotFoundException fnf){
            System.out.println("Fichero no encontrado");
        }
        catch(IOException io){
            System.out.println("Error de entrada/salida");
        }

        finally{

            if(fic!=null){
                System.out.println("\nCerramos el flujo");
                fic.close();
                //cerrar flujo fichero
            }

        }
    }


}
