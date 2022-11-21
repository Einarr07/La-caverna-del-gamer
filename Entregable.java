public class Entregable {
    Boolean entregado;

    //METODOS
    public void entregar(){ // Cambiar el atributo prestado a true
        entregado=true;
    };
    public void devolver(){// Cambiar el atributo prestado a false
        entregado=false;
    };
    public boolean isEntregado(){ //Devuelve el estado de atributo prestado
        if(entregado){
            return true;
        }
        return false;
    };
    public int compareTo(Object a){
        /* Comparar horas estimadas en los videojuegos
            y en las series el número de temporadas
         */

    };

}
