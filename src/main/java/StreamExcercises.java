import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExcercises{

  public static Map<String, List<Employee>> getEmployeesByDepartment(List<Employee> employees){
      //The paramenter supplied is the one taken as a key of map and used as groupingBy criteria
      //The value is a list that contain all object that were grouped my the supplied key
   Map<String,List<Employee>> employeesByDepartment = employees.stream()
      .collect(Collectors.groupingBy(Employee::getDepartment));
    return employeesByDepartment;
  }

    public static Map<Integer, Long> getNumbersFrequency(int[] numbers){
        Map<Integer, Long> numberFrequency = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(number -> number, Collectors.counting()));

        return numberFrequency;
    }

    public static Map<Integer, Long> getNumberFrequency(Integer [] numbers){
        //To pass a unmodified value a key you can use the Function.GetIdentity()
        //The method Collectors.counting() return the number of element for the grouped element
        Map<Integer, Long> numberFrequency = Arrays.asList(numbers).stream()
                .collect(Collectors.groupingBy(number -> number, Collectors.counting()));

        return numberFrequency;
    }

  public static Integer[] getPairNumbers(Integer[] numbers){
      Integer[] pairNumbers = Arrays.stream(numbers)
              .filter(number -> number % 2 == 0 ).toArray(Integer[]::new);
      return pairNumbers;
  }


}