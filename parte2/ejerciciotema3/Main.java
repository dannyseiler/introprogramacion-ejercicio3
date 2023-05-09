package ejerciciotema3;

public class Main {
    public static void main(String[] args) {
        Coche miCoche= new Coche();
        miCoche.MasPuerta();
        System.out.println(miCoche.puertas);
    }

}
class Coche{
    public int puertas=4;

    public void MasPuerta() {
        this.puertas++;
    }
}