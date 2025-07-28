package unidad_03;

public class Actividad_05 {
    public static void main(String[] args) {
        
        // Muestra los números 48, 50, 52, 54,……...., 100.

        int i;

        for (i = 48; i < 100; i+=2) {
            System.out.println(i);
        }

        // IMPORTANTE! i += 2 Primero sumamos y después asignamos. Si lo ponemos al revés: i =+2, asignamos a i el valor +2.
    }
}
