package com.fernandogarcia.fichero;

import java.io.File;

public class ContenidoArchivoOdirectorio {

    public static void main(String[] args) {

        //Creo el File y le indico la path del directorio a entrar
        File file = new File("C:\\Users\\usuario\\Desktop\\foto");

        //Nos guardamos el contenido en un array de tipo File
        File []listaContenido = file. listFiles();

        //Creo una variable contenido para interactuar con este
        String contenido="";

        //Compruevo que exista el directorio
        if (file.exists()){

            //Lo recorro e indico si es carpeta o archivo
            for(File f :listaContenido){

                if (f.isDirectory()){
                    contenido+="d-" + f.getName();
                }
                else {
                    contenido+="f-" + f.getName();
                }
                //Indico si tiene permisos de lectura y escritura
                if (f.canWrite()){
                    contenido+="\tW";
                }
                else {
                    contenido += "\t-";
                }
                if (f.canRead()){
                    contenido+="\tR";
                }
                else{
                    contenido+="\t-";
                }
                //Mostramos el contenido
                System.out.println(contenido);
                //Machacamos el contenido para cada pasada
                contenido="";
            }
        }
        else{
            System.out.println("El directorio no existe");
        }

    }


}
