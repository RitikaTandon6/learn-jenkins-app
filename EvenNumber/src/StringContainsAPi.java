/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
class StringContains
{
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java  API", "Stream API", "Lambda");


        //strings= strings.stream().filter(i->i.contains("API")).collect(Collectors.toList());
       Boolean sgs=strings.stream().anyMatch(i->i.contains("API"));
        System.out.println(sgs);




    }
}