package lessonJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("aaa", "bbb", "ccc", "ddd");
        List<Integer> list2 = new ArrayList<>();
        list2 = list1.stream().map(String::length).collect(Collectors.toList());
    }
}
