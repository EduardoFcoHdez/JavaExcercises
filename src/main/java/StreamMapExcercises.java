import java.util.List;
import java.util.stream.Collectors;


public class StreamMapExcercises {

  /* We cannot use an object method reference because the signature of the map method
   * is expecting a functional interface that receive a string and returns a string and
   * the method below iterates over the object Employee not a String
   */
  public static List<String> getListOfNames(List<Employee> employees){
    return employees.stream().map(employee -> employee.getName())
            .collect(Collectors.toList());
  }

  public static List<Integer> convertStringsToLengths(List<String> strings){
    return strings.stream()
            .map(String::length).collect(Collectors.toList());
  }

  public static List<String> getYoungEmployees(List<Employee> employees){
          List<String> youngEmployees = employees.stream() 
                             .filter(employee -> employee.getAge() < 18)
                             .map(employee -> employee.getName())
                             .collect(Collectors.toList());
      return youngEmployees;
  }

  public static List<String> getEmployeeCapitalizedNames(List<Employee> employees) {
    List<String> capitalizedNames = employees.stream()
        .map(employee -> getCapitalizedWord(employee.getName()))
        .collect(Collectors.toList());
    return capitalizedNames;
  }

  private static String getCapitalizedWord(String word){
    return word.substring(0, 1).toUpperCase() + word.substring(1);
  }


}


