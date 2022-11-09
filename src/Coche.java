public class Coche {


     public static void main(String[] args) {

         auto miCoche = new auto();
         miCoche.agregarPuerta();
         System.out.println(miCoche.puertas);

         }


    static class auto{
             String Color = "";
             String Forma = "";
             int puertas = 0;

             public  void agregarPuerta(){
                 this.puertas++; //suma 1
             }
        }

    public static int suma(int puertas, int puertasAgregar){
          return puertas + puertasAgregar;

    }
}
