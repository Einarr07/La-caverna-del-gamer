public class Videojuegos {

    //ATRIBUTOS
    String titulo;
    int horasEstimadas;
    Boolean entregado;
    String genero;
    String compania;

    //CONTRUCTOR
    public Videojuegos(){
        titulo = "";
        horasEstimadas = 10;
        entregado = false;
        genero = "";
        compania = "";
    }

    public void titulo_horas(){
        titulo = "";
        horasEstimadas = 0;
    }

    public void sin_entregado(){
        titulo = "";
        horasEstimadas = 10;
        //entregado = false;
        genero = "";
        compania = "";
    }

    //SETTER AND GETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
