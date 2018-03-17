class TestiKujundeid {

public static void main(String arg[]){

    Kujund[] kujundid = new Kujund[4];
    kujundid[0] = new Kujund();
    kujundid[1] = new Ruut(5, 8, 4);
    kujundid[2] = new Ring(3, 7, 3);
    kujundid[3] = new Ristkylik(3, 7, 3, 4);

    for (int i = 0; i < kujundid.length; i++) {
        System.out.println("kujundid[" + i + "] = " + kujundid[i]);
    }

Ruut c=new Ruut(24, 4, 10);
System.out.println("Ruudu kuljepikkus on: " + c.kylg); 

Ring d=new Ring(4, 4, 5);
System.out.println("Ringi raadius on: " + d.raadius);

Ristkylik f = new Ristkylik(1, 8, 2, 4);

System.out.println(f.toString());
System.out.println(f.toString2());

    }
}