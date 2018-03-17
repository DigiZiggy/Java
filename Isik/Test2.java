class Test2{

    public static void main(String arg[]){
        Isik2 a=new Isik2();

        System.out.println("Isiku nimi on "+ a.nimi);
        System.out.println("Isiku pikkus on "+ a.pikkus);

        Isik2 b=new Isik2("Juku");
        System.out.println("Isiku nimi on "+ b.nimi);
        System.out.println("Isiku pikkus on "+ b.pikkus);

        Isik2 c=new Isik2("Mari", 1.72);
        System.out.println("Isiku nimi on "+ c.nimi);
        System.out.println("Isiku pikkus on "+ c.pikkus);
    }
}