package com.fernandogarcia.fichero;

import java.io.*;

public class LeerArchivoTexto {

    public static void main(String[] args) throws IOException {


        File file =new File("./fichero.txt");

        FileReader fr=null;
        BufferedReader br=null;

        String linea="";

        StringBuilder stringBuilder = null;

        try {
            fr = new FileReader(file);
            br= new BufferedReader(fr);

            while ((linea = br.readLine()) != null){
                stringBuilder = new StringBuilder(linea);
                System.out.println(stringBuilder);

            }
        }
        catch (FileNotFoundException fnf){
            System.out.println("Archivo no encontrado ");

        }
        catch (IOException io){
            System.out.println("error entrada/salida");

        }
        finally {
            if(br!=null){
                br.close();
            }
        }

    }
}
