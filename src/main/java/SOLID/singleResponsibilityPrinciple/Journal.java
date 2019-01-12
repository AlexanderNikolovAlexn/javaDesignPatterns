package SOLID.singleResponsibilityPrinciple;

import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String entry) {
        entries.add("" + (++count) + ": " + entry);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // here we break SRP
    // as if one class should do only one thing
    // where as if we want to save our Journal, we should use separate class - Persistence
    public void save(String filename) throws Exception
    {
        try (PrintStream out = new PrintStream(filename))
        {
            out.println(toString());
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}
}
