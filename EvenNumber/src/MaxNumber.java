import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class MaxNumber
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Integer> lst = Arrays.asList(1,23,12,5,6,78);
        int va=lst.stream().collect(Collectors.summingInt(i->i));
        int val = lst.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(val);


    }
}