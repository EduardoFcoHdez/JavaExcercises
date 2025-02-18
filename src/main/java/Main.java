import java.util.*;
import java.util.HashMap;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> peopleMap = new HashMap<String, Integer>() {
            {
                put("Eduardo", 42);
                put("Dylan", 10);
                put("Claudia", 39);
                put("Ian", 10);
            }
        };
    
        List<Employee> employees = new ArrayList<Employee>(Arrays.asList(
            new Employee("eduardo", 42, "Finance"),
            new Employee("pie", 55, "Finance"),
            new Employee("dylan", 10, "Finance"),
            new Employee("claudia", 39, "Contrallor"),
            new Employee("ian", 10, "Contrallor")
        ));
        
        /*List<Map.Entry<String, Integer>> youngPeople =  HasmapExcercises.getYoungPeopleNames(peopleMap);
        youngPeople.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));*/
        
        /*List<String> youngPeople = StreamMapExcercises.getYoungEmployees(employees);
        youngPeople.forEach(System.out::println);*/

        /*String reverseStr = StringExcercises.reverseString2("Claudia");
        System.out.println("*************************************************");
        System.out.println(reverseStr);*/

        /*String cleanedString  = StringExcercises.removeWhiteSpaces3("C l a u d i a");
        System.out.println("*************************************************");
        System.out.println(cleanedString);*/

        /*HashMap<Character, Integer> letterCount = new HashMap<>(StringExcercises.countOccurrences("adaaa"));
        letterCount.forEach( (key, value) -> {
            System.out.println("Key:" + key +"Value:" + value);
        });*/

        /*int [] numbers = {1, 2, 3, 2, 1};
        var numberFrequency = ArrayExcercises.getNumbersFrequency(numbers);
        System.out.println(numberFrequency);*/

        /*int [] numbers = {1, 2, 3, 5, 1};
        int[] minMaxValues = ArrayExcercises.findArrayMaxMin(numbers);
        System.out.println(minMaxValues[0]);
        System.out.println(minMaxValues[1]);*/

        /*int [] numbers = {1, 2, 3, 4, 5, 6};
        int[] reversedNumbers = ArrayExcercises.reverseNumbers(numbers);
        for(int number: reversedNumbers){
            System.out.println(number);
        }*/

        /*int [] numbers = {1, 2, 1, 4, 2, 6};
        int[] uniqueNumbers = ArrayExcercises.removeDuplicates(numbers);
        for(int number : uniqueNumbers){
            System.out.println(number);
        }*/
        
        /*List<String> capitalizedNames = StreamMapExcercises.getEmployeeCapitalizedNames(employees);
        capitalizedNames.forEach(System.out::println);*/

        /*var employeesByDepartment = StreamExcercises.getEmployeesByDepartment(employees);
        employeesByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.println("Department:"+department +"Employees:" + employeesInDepartment);
        });*/

        /*var stringsLengths = StreamMapExcercises.convertStringsToLengths(Arrays.asList("shortStuff","MediumStuff","LongStuff"));
        stringsLengths.forEach(System.out::println);*/

        /*Integer [] numbers = {1, 2, 3, 2, 1};
        var numberFrequency = StreamExcercises.getNumberFrequency(numbers);
        System.out.println(numberFrequency);*/

        /*Integer [] numbers = {3,6,9,12};
        var pairNumbers = StreamExcercises.getPairNumbers(numbers);
        Arrays.asList(pairNumbers).forEach(System.out::println);*/

        /*var numbers = Arrays.asList(1, 2, null, 3, null);
        var cleanedNumbers = ArrayExcercises.removeNullElements(numbers);
        cleanedNumbers.forEach( System.out::println );*/
    }
}