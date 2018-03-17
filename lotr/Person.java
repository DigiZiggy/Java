package ee.ttu.iti0202.lotr;


public class Person {

    private String nimi;
    private String rass;
    private Ring sormus;
//    private String race;     /*n2ide*/


    public Person(String race, String name, Ring ring) {
        rass = race;
        nimi = name;
        sormus = ring;
        //    this.race = race;     /*n2ide*/
    }

    public Person(String race, String name) {
        rass = race;
        nimi = name;
    }

    public void setRing(Ring ring) {
        this.sormus = ring;
    }

    public String isSauron() {
        if (this.sormus != null && this.nimi.equals("Sauron") && this.sormus.getType().equals("The one") && this.sormus.getMaterial().equals("gold")) {
            return "Affirmative";
        } else if (this.sormus != null && this.nimi.equals("Sauron") && this.sormus.getType().equals("The one") && !this.sormus.getMaterial().equals("gold")) {
            return "No, the ring is fake!";
        } else if (this.sormus != null && this.sormus.getMaterial().equals("gold") && this.sormus.getType().equals("The one")) {
            return "No, he just stole the ring";
        } else if (this.nimi.equals("Sauron")) {
            return "No, but he's claiming to be";
        } else {
            return "No";
        }
    }

    public String getRace() {
        return rass;
    }
    public String getName() {
        return nimi;
    }
    public Ring getRing() {
        return sormus;
    }
}
