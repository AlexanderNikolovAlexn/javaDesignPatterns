package singleResponsibilityPrinciple;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class SRPDemo {

    public static void main(String[] args) throws Exception {

        Journal j = new Journal();
        j.addEntry("I created a project today");
        j.addEntry("I ate a bug");
        j.addEntry("I fixed a bug");
        j.addEntry("I went home");
        System.out.println(j);

        j.removeEntry(2);
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "d:\\temp\\journal.txt";
        p.saveToFile(j, filename, true);

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + filename);

    }

}
