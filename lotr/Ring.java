package ee.ttu.iti0202.lotr;


public class Ring {

    private String tyyp;
    private String mater;

    public Ring(String type, String material) {
        this.tyyp = type;
        this.mater = material;
    }

    public String getType() {
        return this.tyyp;
    }

    public String getMaterial() {
        return this.mater;
    }
}
