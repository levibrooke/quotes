package quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    public static Quote[] quotes;

    public static void readFile(String filePath) {
        Gson gson = new Gson();

        try {
            // read json file in
            FileReader file = new FileReader(new File(filePath));

            // parse json file w/ gson & instantiate a quote
            quotes = gson.fromJson(file, Quote[].class);

            // print random
            int random = (int) (Math.random() * quotes.length);
            System.out.println(quotes[random].toString());

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
