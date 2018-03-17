public class Main {

    public static void main(String[] args) {

        List girlsList = new List(20, 15, 140, 190);
        List boysList = new List(15, 10, 160, 220);

        System.out.print("Neiud: ");
        // Salvestan listi muutujasse, et v2ltida randomil t2iesti uue listi loomist
        int[] a = girlsList.list();

        System.out.print("Noormehed: ");
        int[] b = boysList.list();

        System.out.println(girlsList.valim(a, b, b.length));

    }
}
