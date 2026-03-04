/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
 class StartWithA
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        long count = names.stream().filter(n->n.startsWith("A")).count();
        System.out.println(count);


    }
}