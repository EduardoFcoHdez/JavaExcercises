import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<String, Integer>() {
            {
                put("Eduardo", 42);
                put("Francisco", 4);
                put("Ian", 10);
            }
        };
        HasmapExcercises.getYoungPeopleNames(people);
    }
}