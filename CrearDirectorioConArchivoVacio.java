package com.fernandogarcia.fichero;

import java.io.File;
import java.io.IOException;

public class CrearDirectorioConArchivoVacio {

    public static void main(String[] args) throws IOException {

        CreaDirectorioConArchivo();

    }

    public static void CreaDirectorioConArchivo() throws IOException {

        //Pongo la ruta donde se crea el dir con el arch.
        //Lo punteamos
        //File directorioPadre = new File("./DirectorioCreado");
        File directorioPadre = new File("C:\\Users\\usuario\\Desktop\\DirectorioCreado");
        //lo creamos
        if(directorioPadre.mkdir()) {
            try {
                File archivoHijo = new File(directorioPadre, "Archivo1.txt");

                if (archivoHijo.createNewFile()) {
                    System.out.println("El archivo1 fue creado correctamente ");
                }

            }catch (IOException io){
                System.out.println("Error de entrada/salida ");
            }
        }
    }
}
