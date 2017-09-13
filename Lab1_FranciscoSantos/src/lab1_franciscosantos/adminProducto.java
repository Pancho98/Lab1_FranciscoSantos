
package lab1_franciscosantos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminProducto {
    private ArrayList<Producto>listaPersonas=new ArrayList();
    private File archivo;

    public adminProducto(String path) {
        archivo=new File(path);
    }
    
    public ArrayList<Producto> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Producto> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setProducto(Producto pd){
        this.listaPersonas.add(pd);
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }
    
    public void cargarArchivo(){
        try {
            listaPersonas = new ArrayList();
            Producto temp;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Producto)objeto.readObject())!=null){
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
            for (Producto t : listaPersonas) {
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
