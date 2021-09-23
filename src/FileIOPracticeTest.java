import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class FileIOPracticeTest {

    public static void main(String[] args) {
        Path pathToDir = Paths.get("src/test");
        try {
            Files.createDirectories(pathToDir);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Path pathtoOurFile = Paths.get("src/data", "list.txt");
        try {
            if (Files.notExists(pathtoOurFile)) {
                Files.createFile(pathtoOurFile);
            } else {
                System.out.println("The " + pathtoOurFile + " file already exists!");
            }
        } catch (IOException ioe) {
            System.out.println("There was a problem!");
            ioe.printStackTrace();
        }

        List<String> hxcBands = Arrays.asList("Trial", "Judge", "Minor Threat", "Gorilla Biscuits", "Comeback Kid", "Modern Life Is War", "Bane", "Terror", "Verse");
        try{
            Files.write(pathtoOurFile, hxcBands);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }


//        List<String> currentList = new ArrayList<>();
//        try{
//            currentList = Files.readAllLines(pathtoOurFile);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        for (String band : currentList){
//            System.out.println(band);
//        }

        FileIOPractice practice = new FileIOPractice();
        practice.readFileAndOutput(pathtoOurFile);

        try{
            Files.writeString(pathtoOurFile, "Figure Four\n", StandardOpenOption.APPEND);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        practice.readFileAndOutput(pathtoOurFile);


        List<String> newHxCBands = new ArrayList<>();
        newHxCBands.add("Kublai Khan");
        newHxCBands.add("Harm's Way");
        newHxCBands.add("Knocked Loose");

        try{
            Files.write(pathtoOurFile, newHxCBands, StandardOpenOption.APPEND);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        practice.readFileAndOutput(pathtoOurFile);

        List<String> currentList = new ArrayList<>();
        try{
            currentList = Files.readAllLines(pathtoOurFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        Iterator<String> listIterator = currentList.iterator();
        while(listIterator.hasNext()){
            String item = listIterator.next();
            if (item.equals("Comeback Kid")){
                listIterator.remove();
            }
        }

        try {
            Files.write(pathtoOurFile, currentList);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }


        practice.readFileAndOutput(pathtoOurFile);
    }
}
