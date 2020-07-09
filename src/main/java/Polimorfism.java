public class Polimorfism
{
    public static void main(String[] args)
    {
     Vehicul Kawasaki=new Motocicleta();         //cu interfata
     Vehicul Boeing=new Avion();
     System.out.println("Motocicleta este vehicul"+" "+ Kawasaki.type());
     System.out.println("Avionul este vehicul"+" "+ Boeing.type());

     Vehicul1 carutaMea= new Caruta(); // cu mostenire
     carutaMea.tip();

    }
}
