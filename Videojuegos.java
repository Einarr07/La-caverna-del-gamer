import java.util.Scanner;

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

    //METODOS

    Scanner entrada = new Scanner(System.in);
    public void toString(Videojuegos datos1){
        System.out.println("Titulo: ");
        datos1.setTitulo(entrada.nextLine());
        System.out.println("Horas Estimadas: ");
        datos1.setHorasEstimadas(5);
        System.out.println("Entregado: ");
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
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compania;
    }
}
