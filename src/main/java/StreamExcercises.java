import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExcercises{

  public static Map<String, List<Employee>> getEmployeesByDepartment(List<Employee> employees){

   //The paramenter supplied is the one taken as a key of the mapand the groupingBy method
    //returns a list of the employees with the property supplied in the paramenter 
   Map<String,List<Employee>> employeesByDepartment = employees.stream()
      .collect(Collectors.groupingBy(Employee::getDepartment));
    return employeesByDepartment;
  }

  public static Map<Integer, Long> getNumberFrequency(Integer [] numbers){    
    //To pass a unmodified value a key you can use the Function.GetIdentity()
    //The method Collectors.counting() return the number of element for the grouped element
    Map<Integer, Long> numberFrequency = Arrays.asList(numbers).stream()
      .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

    return numberFrequency;
  }
}