import java.util.Scanner;
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;


public class JsonReader {
    private Scanner reader;
    private File file;
    private ArrayList attributes;
    private ArrayList values;

    public JsonReader() {
        file = null;
        reader = null;
        attributes = new ArrayList();
        values = new ArrayList();
    }

    public JsonReader(File file) {
        this.file = file;

        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException exception) {
            reader = null;
        }

        attributes = new ArrayList();
        values = new ArrayList();
    }

}
