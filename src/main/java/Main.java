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
        
        /*String reverseStr = StringExcercises.reverseString("Eduardo");
        System.out.println(reverseStr);*/
        
        /*List<String> capitalizedNames = StreamMapExcercises.getEmployeeCapitalizedNames(employees);
        capitalizedNames.forEach(System.out::println);*/

        /*var employeesByDepartment = StreamExcercises.getEmployeesByDepartment(employees);

        employeesByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.println("Department:"+department +"Employees:" + employeesInDepartment);
        });*/

        var stringsLengths = StreamMapExcercises.convertStringsToLengths(Arrays.asList("shortStuff","MediumStuff","LongStuff"));
        stringsLengths.forEach(System.out::println);

        
         /*Integer [] numbers = {1, 2, 3, 2, 1};
        var numberFrequency = StreamExcercises.getNumberFrequency(numbers);
        System.out.println(numberFrequency);*/
        
    }
}