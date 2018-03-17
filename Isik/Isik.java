class Isik implements Comparable{

    private String nimi;	 // isendiväli isiku nime jaoks
    private double pikkus;		//isendiväli isiku pikkuse jaoks

    Isik(String isikuNimi, double isikuPikkus){
        nimi=isikuNimi;
        pikkus=isikuPikkus;

    }
    double võtaPikkus(){
        return pikkus;
    }

    public int compareTo(Object o){
        if(this.võtaPikkus()>((Isik)o).võtaPikkus()){
            return 1;}
        else if (this.võtaPikkus()<((Isik)o).võtaPikkus()){
            return -1;
        }else{
            return 0;
        }


    }

    public String toString(){
        return nimi+"(pikkusega " + pikkus + ")";

    }
}