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
            new Employee("eduardo", 42),
            new Employee("dylan", 10),
            new Employee("claudia", 39),
            new Employee("ian", 10)
        )); 
        
        
        /*List<Map.Entry<String, Integer>> youngPeople =  HasmapExcercises.getYoungPeopleNames(peopleMap);
        youngPeople.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));*/
        
        /*List<String> youngPeople = StreamMapExcercises.getYoungEmployees(employees);
        youngPeople.forEach(System.out::println);*/        
        
        List<String> capitalizedNames = StreamMapExcercises.getEmployeeCapitalizedNames(employees);
        capitalizedNames.forEach(System.out::println);
        
        
    }
}