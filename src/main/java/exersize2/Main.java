package exersize2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mohammad", "ali", "mina", "raha", "minoo");
        System.out.println(sortBySize(list));
        System.out.println(sortBySizeWithNumber(list));
    }

    private static Collection<List<String>> sortBySize(List<String> list) {
        Map<Integer, List<String>> result = sortBySizeWithNumber(list);
        return result.values();
    }

    private static Map<Integer, List<String>> sortBySizeWithNumber(List<String> list) {
        Map<Integer, List<String>> result = list.stream().collect(Collectors.groupingBy(String::length));
        return result;
    }
}
