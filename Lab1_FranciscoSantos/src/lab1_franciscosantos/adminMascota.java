
package lab1_franciscosantos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminMascota {
    private ArrayList<Mascota>listaPersonas=new ArrayList();
    private File archivo;

    public adminMascota(String path) {
        archivo=new File(path);
    }
    
        public ArrayList<Mascota> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Mascota> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setMascota(Mascota mc){
        this.listaPersonas.add(mc);
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }
    
    public void cargarArchivo(){
        try {
            listaPersonas = new ArrayList();
            Mascota temp;
            if (archivo.exists()) {
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Mascota)objeto.readObject())!=null){
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
            for (Mascota t : listaPersonas) {
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
