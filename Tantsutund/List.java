import java.util.*;


public class List {

    Random random = new Random();
    private int[] girlsHeigths;
    private int[] boysHeigths;
    private int boundHigh;
    private int boundLow;
    private int minHeigth;
    private int maxHeigth;


    List(int boundHigh, int boundLow, int minHeigth, int maxHeigth) {
        this.girlsHeigths = girlsHeigths;
        this.boysHeigths = boysHeigths;
        this.boundHigh = boundHigh;
        this.boundLow = boundLow;
        this.maxHeigth = maxHeigth;
        this.minHeigth = minHeigth;
    }

    private int get_boundHigh(){
        return boundHigh;
    }

    private int get_boundLow(){
        return boundLow;
    }

    private int get_maxHeigth(){
        return maxHeigth;
    }

    private int get_minHeigth(){
        return minHeigth;
    }


    int[] list() {

        //Loon x suurusega massiivi
        int x = random.nextInt(get_boundHigh() - get_boundLow()) + get_boundLow();
        int heigths[] = new int[x];

        for (int i = 0; i < x; i++) {
            //Loon random numbrid teatud pikkuste vahel
            int heigth = random.nextInt(get_maxHeigth() - get_minHeigth()) + get_minHeigth();

            // Panen need random numbrid listi, juhul kui nad juba ei eksisteeri listis
            boolean excists = true;
            for (int n : heigths) {
                if (n == heigth) {
                    excists = false;
                }
            }
            if(excists)
                heigths[i] = heigth;

            // Kui eksisteeris listis, tee see sama loop'i samm uuesti
            else
                i--;
        }

        // Prindin listi elemendid ehk pikkused
        for (int i = 0; i < heigths.length; i++) {
            System.out.print(heigths[i] + "  ");
        }
        System.out.println("\n");
        return heigths;
    }


    String valim(int[] girls, int[] boys, int howManyBoys){

        // Loon sama suure neidude listi, kui suur on poste list
        int girlsFinal[] = new int[howManyBoys];
        for (int i = 0; i < howManyBoys; i++) {
            girlsFinal[i] = girls[i];
        }

        // Sorteerin listid vastavalt suurusele
        Arrays.sort(girlsFinal);
        Arrays.sort(boys);

        int e = 0;

        //prindin listid v2lja paarides vastavalt pikkuste j2rgi
        for (int i = boys.length-1; i >= 0; i--) {
            int indexNum = getArrayIndex(girls, girlsFinal[i]);
            System.out.println("noormees nr " + e + " (" + boys[i] +
                    ") & neiu nr " + indexNum + " (" + girlsFinal[i] + ")");
            e++;
        }
        return "\n Kena tantsutundi!";
    }

    // Loon meetodi, et saada teada, mis indexil oli neiu esialgses listis
    private int getArrayIndex(int[] array, int value) {

        int index=0;
        for(int i=0; i < array.length; i++){

            if(array[i]==value){
                index=i;
                break;
            }
        }
        return index;
    }
}



