package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


public class Controller {
    public static GraphicsContext gc;


    @FXML
    Canvas joonis = new Canvas(650, 650);


    public void initialize(){
        gc = joonis.getGraphicsContext2D();
        drawShapes(gc);
    }


    static void drawShapes(GraphicsContext gc) {
        // Saa toa muutujad andmebaasist k2tte toa sisesta meetotide abil
        double laius = Tuba.selectWidth();
        double pikkus = Tuba.selectHeigth();
        double sisemine_laius = Tuba.selectInnerWidth();
        double sisemine_pikkus = Tuba.selectInnerHeigth();
        double uks = Tuba.selectDoor();

        //Joonista ristkylik A
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.fillRect(100.0, 100.0, (laius - sisemine_laius), pikkus);
        gc.setFill(Color.WHITE);
        gc.fillRect(110.0, 110.0, (laius - sisemine_laius)-20, pikkus-20);

        //Joonista ristkylik B
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.fillRect(100.0, 100.0, laius, (pikkus - sisemine_pikkus));
        gc.setFill(Color.WHITE);
        gc.fillRect(110.0, 110.0, laius-20, (pikkus - sisemine_pikkus)-20);

        // Joonista joon, mis kataks ristkylikute kattekoha
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(10);
        gc.strokeLine(115, (pikkus - sisemine_pikkus)+95, 85 + (laius - sisemine_laius), (pikkus - sisemine_pikkus)+95);

        // Joonista ukseava ehk valge joon
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(10);
        gc.strokeLine((laius - sisemine_laius)+95, (pikkus - sisemine_pikkus) + 130, (laius - sisemine_laius)+95, uks+(pikkus - sisemine_pikkus)+130);

    }

    // Joonista text kylgede suuruste kohta kylgede juurde
    static void drawText(){
        double laius = Tuba.selectWidth();
        double pikkus = Tuba.selectHeigth();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);

        // Text toa vasaku kylje pikkuse juurde
        gc.strokeText("Tuba on" , 10, 80+(pikkus/2));
        gc.strokeText("pikkusega ", 10, 100+(pikkus/2));
        gc.strokeText( Double.toString(pikkus), 10, 120+(pikkus/2));
        gc.strokeText("detsimeetrit.", 10, 140+(pikkus/2));

        // Text toa ylesse kylje laiuse kohta
        gc.strokeText("Tuba on laiusega " + laius + " detsimeetrit.", 100+(laius/4), 80);
        }


    public void hiir(MouseEvent event){
        double laius = Tuba.selectWidth();
        double pikkus = Tuba.selectHeigth();
        double sisemine_laius = Tuba.selectInnerWidth();
        double sisemine_pikkus = Tuba.selectInnerHeigth();
        double uks = Tuba.selectDoor();

        //Joonista ristkylik A
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.fillRect(100.0, 100.0, (laius - sisemine_laius), pikkus);
        gc.setFill(Color.WHITE);
        gc.fillRect(110.0, 110.0, (laius - sisemine_laius)-20, pikkus-20);

        //Joonista ristkylik B KOLLASEKS
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.fillRect(100.0, 100.0, laius, (pikkus - sisemine_pikkus));
        gc.setFill(Color.YELLOW);
        gc.fillRect(110.0, 110.0, laius-20, (pikkus - sisemine_pikkus)-20);

        // Joonista kolmnurk
        gc.setFill(Color.WHITE);
        gc.fillPolygon(new double[]{110, 110, 90+(laius - sisemine_laius)},
                new double[]{110, 90+(pikkus - sisemine_pikkus), 90+(pikkus - sisemine_pikkus)}, 3);

        // Joonista joon, mis kataks ristkylikute kattekoha
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(10);
        gc.strokeLine(115, (pikkus - sisemine_pikkus)+95, 85 + (laius - sisemine_laius), (pikkus - sisemine_pikkus)+95);

        // Joonista ukseava ehk valge joon
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(10);
        gc.strokeLine((laius - sisemine_laius)+95, (pikkus - sisemine_pikkus) + 130, (laius - sisemine_laius)+95, uks+(pikkus - sisemine_pikkus)+130);

    }
}
