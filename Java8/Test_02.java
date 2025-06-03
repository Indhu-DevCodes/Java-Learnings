package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test_02 {

    public static void main(String[] args) {
//        groupNumbersByRangeInWhichTheyBelong();
//        findIntegerInStringArr();
//        findProductOfFirstTwoNumInArr();
//        findAnagramsFromList();
        multiplyAlternativeNumbers();

    }

    /*
    given an array of integer, group the numbers by the range in which they belong.
    Input: int[] arr = {2,3,10,14,23,31,35,25,60,69,90,89,85};
    output: {0=[2, 3], 10=[10, 14], 20=[23, 25], 30=[31, 35], 60=[60, 69], 90=[90], 80=[89, 85]}
     */
    private static void groupNumbersByRangeInWhichTheyBelong() {
        int[] arr = {2,3,10,14,23,31,35,25,60,69,90,89,85};
        Map<Integer, List<Integer>> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new, Collectors.toList()));
        System.out.println(collect);

    }

    /*
    given a list of strings, create a list that contains only integers.
    Input: String[] arr = {"abc", "456", "123", "xyz"};
    output:
     */

    private static void findIntegerInStringArr() {
        String[] arr = {"abc", "456", "123", "xyz"};

        //approach -1
        Arrays.stream(arr)
                .filter(s -> s.chars()
                        .mapToObj(x -> (char)x)
                        .allMatch(Character::isDigit)
                )
                .forEach(System.out::println);

        //approach -2
        List<Integer> collect = Arrays.stream(arr)
                .filter(x -> x.matches("[0-9]+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    /*
    find the product of the first two elements from an array.
    Input: int[] arr = {12,5,6,9,2,4};
    Output: 15
     */

    private static void findProductOfFirstTwoNumInArr() {
        int[] arr = {5,3,6,9,2,4};
        int reduce = Arrays.stream(arr)
                .limit(2)
                .reduce(1, (x, y) -> x * y);  // if arr is empty then 1 will be the answer
        System.out.println(reduce);
    }

    /*
    group/pair Anagrams from a list of strings. for 1 word consider only 1 anagram
    Input: String[] arr = {"tree", "pat", "tap", "pan", "team", "nap", "meat"};
    Output: [[pan, nap], [pat, tap], [team, meat], [tree]]
     */
    private static void findAnagramsFromList() {
        String[] arr = {"tree", "pat", "tap", "pan", "team", "nap", "meat"};
        List<List<String>> list = Arrays.stream(arr)
                .collect(Collectors.groupingBy(x ->
                        Arrays.stream(x.toLowerCase().split(""))
                                .sorted()
                                .collect(Collectors.toList())))
                .values()
                .stream()
                .toList();
        System.out.println(list);
    }

    /*
    write a stream program to multiply alternative numbers in an array
    Input:  int[] arr = {1,2,3,4,5,6};
    output : 15
    // 1*3*5 = 15
     */
    private static void multiplyAlternativeNumbers() {
        int[] arr = {1,2,3,4,5,6};
        int result = IntStream.range(0, arr.length)
                .filter(x -> x % 2 == 0)
                .map(x -> arr[x])
                .reduce(1, (a, b) -> a * b);

        System.out.println(result);
    }

    /*
    write a stream program to multiply 1st and last element 2nd and 2nd last element, etc numbers in array.
    Input: int[] arr = {4,5,1,7,2,9};
    output: 36, 10, 7
     */



}

