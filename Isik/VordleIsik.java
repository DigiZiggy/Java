class VordleIsik{

    public static void main(String[] args){

        Isik a=new Isik("Juhan Juurikas", 1.99);
        Isik b=new Isik("Madli Mallikas", 1.55);

        System.out.print("isik " +a + " on võrreldes isikuga " +b);

        if(a.compareTo(b)>0){
            System.out.println(" pikem");
        }else if (a.compareTo(b)<0){
            System.out.println(" lühem");
        }
        else{
            System.out.println(" sama pikk");
        }
    }


}