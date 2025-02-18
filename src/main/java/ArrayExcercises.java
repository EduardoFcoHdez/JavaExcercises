import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayExcercises {

    public static Map<Integer, Integer> getNumbersFrequency(int [] numbers){
        Map<Integer, Integer> numbersFrequency = new HashMap<Integer, Integer>();

        for(int i=0; i< numbers.length; i++){

            if (numbersFrequency.keySet().contains(numbers[i]))
                continue;

            var number = numbers[i];
            var numberFrequency = 0;
            for(int j=0; j< numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    numberFrequency ++;
                    numbersFrequency.put(number, numberFrequency);
                }
            }
        }
        return numbersFrequency;
    }

    public static int[] findArrayMaxMin(int[] numbers){
        var maxNumber = numbers[0];
        var minNumber = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
            if(numbers[i]< minNumber){
                minNumber = numbers[i];
            }
        }
        int[] minMaxValues = {minNumber, maxNumber};
        return minMaxValues;
    }

    public static int[] reverseNumbers(int[] numbers){
        int temp = 0;

        for (int i = 0, j = numbers.length - 1; i < j ; i++, j--){

            System.out.println("i:"+i);
            System.out.println("j:"+j);

            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        return numbers;
    }

    public static int[] removeDuplicates(int[] numbers){

        List<Integer> uniqueNumbers = new ArrayList<Integer>();
        int[] result;

        for(int i = 0; i < numbers.length; i++){
            if(!uniqueNumbers.contains(numbers[i])){
                uniqueNumbers.add(numbers[i]);
            }
        }

        result = new int[uniqueNumbers.size()];
        for(int i = 0; i < uniqueNumbers.size(); i++){
            result[i] = uniqueNumbers.get(i);
        }

        return result;
    }

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
