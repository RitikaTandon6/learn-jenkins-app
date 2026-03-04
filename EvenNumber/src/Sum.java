/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
 class Sum
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //int names=numbers.stream().collect(Collectors.summingInt(i->i));
        int sm=numbers.stream().filter(i->i%2==0).mapToInt(i-> i).sum();
        System.out.println(sm);




    }
}