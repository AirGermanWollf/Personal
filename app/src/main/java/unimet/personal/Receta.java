package unimet.personal;

/**
 * Created by MIGUEL on 22/05/2017.
 */

public class Receta {
    private int ID;
    private String Imagen;
    private String Nombre;
    private String Categoria;
    private int Comensales;
    private String Ingredientes[];
    private String Preparacion[];
    private String Tips;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getComensales() {
        return Comensales;
    }

    public void setComensales(int comensales) {
        Comensales = comensales;
    }

    public String[] getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        Ingredientes = ingredientes;
    }

    public String[] getPreparacion() {
        return Preparacion;
    }

    public void setPreparacion(String[] preparacion) {
        Preparacion = preparacion;
    }

    public String getTips() {
        return Tips;
    }

    public void setTips(String tips) {
        Tips = tips;
    }

    public Receta (){
    }

}
