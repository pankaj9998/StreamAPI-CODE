import java.util.Arrays;
import java.util.List;

class Demo
{
    public static void main(String[] args)
    {
        List<Integer> myList=Arrays.asList(23,45,21,45,33);
        myList.stream()
        .sorted()
        .forEach(System.out::println);
    }
}