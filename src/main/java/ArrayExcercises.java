import java.util.ArrayList;
import java.util.List;

public class ArrayExcercises {

    public static List<Integer> removeNullElements(List<Integer> numbers){
        List<Integer> cleanedNumbers = new ArrayList<Integer>();

        for(Integer number: numbers){
            if(number != null){
                cleanedNumbers.add(number);
            }
        }
        return cleanedNumbers;
    }
}
