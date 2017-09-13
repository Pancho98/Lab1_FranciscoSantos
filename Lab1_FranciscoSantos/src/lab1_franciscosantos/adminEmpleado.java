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
public class adminEmpleado {
    private ArrayList<Empleado>listaPersonas=new ArrayList();
    private File archivo;

    public adminEmpleado(String path) {
        archivo=new File(path);
    }
    
    public ArrayList<Empleado> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Empleado> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setEmpleado(Empleado em){
        this.listaPersonas.add(em);
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }
    
    public void cargarArchivo(){
        try {
            listaPersonas = new ArrayList();
            Empleado temp;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Empleado)objeto.readObject())!=null){
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
            for (Empleado t : listaPersonas) {
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
