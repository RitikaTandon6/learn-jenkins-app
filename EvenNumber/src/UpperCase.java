/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class UpperCase
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");
        names=names.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(names);




    }
}