// Assignment Problem 5
import java.util.*;

public class RandomOrder {

    public static void main(String[] args) {
        
        
        List<String> argsList = Arrays.asList(args);
        Collections.shuffle(argList);

        
        argsList.stream().forEach(e->System.out.format("%s ",e));

        
        for (String arg: argsList) {
            System.out.format("%s ", arg);
        }

    
    }
}