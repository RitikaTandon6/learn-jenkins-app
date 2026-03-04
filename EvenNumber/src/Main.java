import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer> al= Arrays.asList(1, 2, 3, 4, 5, 6);
        al=al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(al);
//al.stream().sorted().collect(Collectors.toList());
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
      //  long count = names.stream().filter(n->n.startsWith("A")).count();
        }
    }
