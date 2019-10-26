package com.fernandogarcia.fichero;

import java.io.File;
import java.io.IOException;

public class ContenidoDirectorio {

    public static void main(String[] args)throws IOException {


            File directorio = new File("C:\\Users\\usuario\\Desktop\\foto");

            if (directorio.exists()){

                System.out.println("Mostramos el contenido del directorio");

                String[] contenido=directorio.list();

                for(String s:contenido){
                    System.out.println(s);
                }
            } else {
                System.out.println("El directorio no existe ");
            }

    }
}
