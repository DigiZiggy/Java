class Kalkulaator{

    private double x1;
    private double x2;

    //konstruktor
    Kalkulaator(double x1, double x2){
        this.x1=x1;
        this.x2=x2;
    }

    double liitmine(){
        double y;
        y=x1+x2;
        return y;
    }

    double lahutamine(){
        return (x1-x2);
    }

    double korrutamine(){
        return x1*x2;
    }

    double jagamine(){
        return x1/x2;
    }

}