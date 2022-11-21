public class Serie {
    //Atributos
    String titulo;
    int numero_de_temporadas;
    boolean entregado;
    String genero;
    String creador;

    //Constructor
    public Serie(){
        titulo = "";
        numero_de_temporadas = 3;
        entregado = false;
        genero = "";
        creador = "";
    }
    //
    public void titulo_creador(){
        titulo = "Peaky Blinders";
        numero_de_temporadas = 0;
        genero = "";
        entregado = false;
        creador = "Steven Knight";
    }
    public void no_entregado(){
        titulo = "";
        numero_de_temporadas = 0;
        genero = "";
        creador = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_de_temporadas() {
        return numero_de_temporadas;
    }

    public void setNumero_de_temporadas(int numero_de_temporadas) {
        this.numero_de_temporadas = numero_de_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}