/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_franciscosantos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Francisco Santos
 */
public class adminPersona {
    private ArrayList<Cliente>listaPersonas=new ArrayList();
    private File archivo;

    public adminPersona(String path) {
        archivo=new File(path);
    }
    
    public ArrayList<Cliente> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Cliente> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setCliente(Cliente cl){
        this.listaPersonas.add(cl);
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }
    
    public void cargarArchivo(){
        try {
            listaPersonas = new ArrayList();
            Cliente temp;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Cliente)objeto.readObject())!=null){
                        listaPersonas.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw= new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (Persona t : listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
