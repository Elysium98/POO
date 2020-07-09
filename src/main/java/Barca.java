
class Barca extends Ambarcatiuni  // Mostenire
{
    private String Nume="Barca minune";
    public static void main(String[] args)
    {
    Barca myBoat=new Barca();
    Barca.motor();
    System.out.println(myBoat.Nume + " ");

    }
}
