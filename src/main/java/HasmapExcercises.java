import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

public class HasmapExcercises{
    
    public static List<Map.Entry<String, Integer>> getYoungPeopleNames(HashMap<String, Integer> people) {
       List<Map.Entry<String, Integer>> youngPeople = people.entrySet().stream()
                                                                        .filter(entry -> entry.getValue() < 18)
                                                                        .collect(Collectors.toList());

        return youngPeople;
    }
    
}