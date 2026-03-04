import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        //System.out.println(st);

        //c->c based on what we need to group.
        Map<Integer,Long> mp=numbers.stream().collect(Collectors.groupingBy(c -> c,()->new HashMap<>(),Collectors.counting()));
numbers=mp.entrySet().stream().filter(i->i.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toList());
System.out.println(numbers);
    }
}
