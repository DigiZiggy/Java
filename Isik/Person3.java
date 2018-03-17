class Person3 {

    private String name;
    private Double heigth;

    //konstruktor 1
    Person3(){
        name ="Nimetu";
        heigth =0.0;
    }
    // konstruktor 2
    Person3(String naming){
        name =naming;
        heigth =0.0;
    }
    // konstruktor3
    Person3(String name, Double heigth){
        this.name = name;
        this.heigth = heigth;
    }

//piilumeetodid

    String get_name(){
        return name;
    }

    Double get_heigth(){
        return heigth;
    }
}