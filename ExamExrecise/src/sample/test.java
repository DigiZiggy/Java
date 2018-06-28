package sample;

import javafx.application.Application;
import java.util.Scanner;


class test {
    static double pikkus;
    static double laius;
    static double sisemine_pikkus;
    static double sisemine_laius;
    static double uks;

    public static void main(String arg[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta veranda väline pikkus detsimeetrites:");
        pikkus = input.nextDouble();
        System.out.println("Sisesta veranda väline laius detsimeetrites:");
        laius = input.nextDouble();
        System.out.println("Sisesta veranda sisene pikkus detsimeetrites:");
        sisemine_pikkus = input.nextDouble();
        System.out.println("Sisesta veranda sisene laius detsimeetrites:");
        sisemine_laius = input.nextDouble();
        System.out.println("Sisesta veranda ja toa vahel oleva ukse suurus detsimeetrites:");
        uks = input.nextDouble();

        Tuba room = new Tuba(pikkus, laius, sisemine_pikkus, sisemine_laius, uks);
        room.anna_info();
        room.insert(pikkus, laius, sisemine_pikkus, sisemine_laius, uks);
        //     room.selectAll();
        Raam display = new Raam();
        Application.launch(Raam.class);

    }
}