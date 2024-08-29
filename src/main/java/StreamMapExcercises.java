import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class StreamMapExcercises {

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

class Employee {
  String name;
  int age;

  Employee() {
  }

  Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String getName() {
    return this.name;
  }

  void setName(String name) {
    this.name = name;
  }

  int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  };

}
