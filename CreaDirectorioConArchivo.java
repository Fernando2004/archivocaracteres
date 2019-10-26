package com.fernandogarcia.fichero;

import java.io.File;
import java.io.IOException;

public class CreaDirectorioConArchivo {

    public static void main(String[] args) throws IOException{

        File directorioPadre = new File("./DirectorioCreado");

        if (directorioPadre.mkdir()) {
            try {
                File directorio1 = new File(directorioPadre, "1Aval");
                File directorio2 = new File(directorioPadre, "2Aval");
                File directorio3 = new File(directorioPadre, "3Aval");

                if ( directorio1.mkdir()){

                    File archivo1 = new File(directorio1,"ExamenMio.txt");
                    File archivo2 = new File(directorio1,"ExamenTuyo.txt");

                    if(archivo1.createNewFile()) {
                        System.out.println("El archivo1 se ha creado");
                    }
                    if(archivo2.createNewFile()) {
                        System.out.println("El archivo2 se ha creado");
                    }
                }
                directorio2.mkdir();
                directorio3.mkdir();

            } catch (IOException e) {
                System.out.println("no se pudo crear el archivo ");
            }
        }
    }

}
