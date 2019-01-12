package SOLID.singleResponsibilityPrinciple;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class Persistence {

    public void saveToFile(Journal journal,
                           String filename,
                           boolean overwrite) throws Exception
    {
        if (overwrite || new File(filename).exists())
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
    }

    public void load(Journal journal, String filename) {}
    public void load(Journal journal, URL url) {}

}
