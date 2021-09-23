import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class FileIOPractice {


    public void readFileAndOutput(Path pathToFile){
        List<String> linesInTheFile = new ArrayList<>();
        try{
            linesInTheFile = Files.readAllLines(pathToFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        for (String line : linesInTheFile){
            System.out.println(line);
        }
    }
}
