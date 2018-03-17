class TestKalkulaator{

    public static void main(String arg[]){

        Kalkulaator a=new Kalkulaator(2,4);
        System.out.println("+ " +a.liitmine());
        System.out.println("- "+a.lahutamine());
        System.out.println("* "+a.korrutamine());
        System.out.println("/ "+a.jagamine());

    }
}