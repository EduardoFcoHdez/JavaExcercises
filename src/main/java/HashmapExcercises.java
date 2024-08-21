import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

public class HasmapExcercises{
    
    public static void getYoungPeopleNames(HashMap<String, Integer> people) {
        var peopleAges = people.entrySet().stream().filter(entry -> entry.getValue() < 18).collect(Collectors.toList());

        for (Map.Entry<String, Integer> name : peopleAges) {
            System.out.print(name.getKey());
        }

    }
    
}