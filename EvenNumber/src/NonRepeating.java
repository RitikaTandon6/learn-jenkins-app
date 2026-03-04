import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeating {
    public static void main(String[] args) {
        String input = "swiss";
        Map<Character,Long>mp = input.chars().mapToObj(i->(char)i).collect( Collectors.groupingBy(c->c,()->new LinkedHashMap<Character,Long>(),Collectors.counting()));
        //Map<Character,Long>mp = input.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        Character ch = mp.entrySet().stream().filter(i->i.getValue()==1).map(entry->entry.getKey()).findFirst().orElse(null);
       // Character ch = mp.entrySet().stream().filter(i->i.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(ch);
    }
}
