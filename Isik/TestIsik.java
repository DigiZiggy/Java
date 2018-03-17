public class TestIsik {

    public static void main (String args[]) {

        Isik a = new Isik("Malle", 1.6);
        Isik b = new Isik("Juku", 1.9);

        System.out.println(a.võtaPikkus());
        System.out.println(b.võtaPikkus());

        if(a.compareTo(b)>0) {
            System.out.println(" pikem");

        } else if (a.compareTo(b)<0) {
            System.out.println(" lühem");
        } else {
            System.out.println("Sama pikad");


        }


    }
}
