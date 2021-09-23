import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }
}
