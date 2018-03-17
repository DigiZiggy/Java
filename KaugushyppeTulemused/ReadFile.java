import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {

    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "/Users/sigridnarep/Documents/UniOfTechnology/JAVA/Lorents/LorentsProject/KaugushyppeTulemused/kaugus.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<String> lines = new ArrayList<String>();

            while((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            // Always close files.
            bufferedReader.close();
            osalejad(lines);
            whoWins(lines);

        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    static private void osalejad(List<String> lines){

        String[] arr = lines.toArray(new String[lines.size()]);
        System.out.print("\nOsalejad: ");

                for (String s : arr) {
                    String[] parts = s.split(" ");
                    System.out.print(parts[0] + " ");
                }
    }


    static private void whoWins(List<String> lines){

        String[] arr = lines.toArray(new String[lines.size()]);

        String[] listInList = new String[]{};
        Double values[] = new Double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String[] parts = arr[i].split(" ");
            double var= Double.parseDouble(parts[1]);
            values[i] = var;
        }

        double max = values[0];
        for (int counter = 1; counter < values.length; counter++)
        {
            if (values[counter] > max)
            {
                max = values[counter];
            }
        }

        String[] winner = arr[getArrayIndex(arr, max)].split(" ");
        System.out.print("\n\nVõitis " + winner[0] + " tulemusega " + max + "\n");
    }


    static private int getArrayIndex(String[] arr, double value) {

        int index = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i].contains(Double.toString(value))){
                index=i;
                break;
            }
        }
        return index;
    }
}
