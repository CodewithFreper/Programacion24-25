package unidad_03;

public class Actividad_06 {
    public static void main(String[] args) {

        //Calcular la suma de los números comprendidos entre 1 y 100

        int i;
        int suma = 0;

        for (i = 1; i < 100; i++) {
            suma += i;
        //    System.out.println(suma + " += " + i);    PONEMOS ESTO PARA VER CÓMO FUNCIONA
        }
        System.out.println("La suma de los números comprendidos entre 1 y 100 es: " + suma); 
    
    }
}
