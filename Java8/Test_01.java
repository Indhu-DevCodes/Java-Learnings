package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test_01 {


    public static void main(String[] args) {
//      MaxLengthOfString();
//      RemoveDuplicates();
//      NthHighestString(2);
//      NthHighestStringWordCount(6);
//      OccurrenceOfWords();
//      findNumOfVowelsInWords();
//      separateEvenAndOddNum();
//      OccurrenceOfCharacters();
//        sumOfUniqueElements();
//        findFirstNonRepeatedChar();
        findFirstRepeatedChar();
    }

    /*
    Given a sentence, find the word that has the highest length
    Input: I am learning streams api in Java
    Output: learning
     */
    private static void MaxLengthOfString(){
        String sentence = "I am learning streams api in Java";
        String[] s = sentence.split(" ");

        //approach-1
        String str1 = Arrays.stream(s)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(str1);

        //approach-2
        String str2 = Arrays.stream(s)
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(str2);       //get() returns NoSuchElementException if no value is found, so instead of get() use ifPresent()

    }

    /*
    Remove duplicates from the string and return in same order
    Input: dabccadefg
    Output: dabcefg
     */
    private static void RemoveDuplicates() {
        String s = "dabccadefg";

        // approach -1 >>> here we are getting it as Set and unordered
        Set<String> set = new HashSet<>();
        Set<String> collect = Arrays.stream(s.split("")).filter(set::add).collect(Collectors.toSet());
        System.out.println(collect);

        // approach -2
        s.chars().distinct().mapToObj(x -> (char)x).forEach(System.out::println);

        // approach -3 >>> instead of foreach use Collects.joining() which is concatenate elements of a stream into a single String.
        String l =  Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
        System.out.println(l);

    }

    /*
    Given a sentence, find the word that has the 2nd nth highest length
    Input: I am learning streams api in Java
    Output: streams
     */
    private static void NthHighestString(int n) {

        String str = "I am learning streams api in Java";
        String result = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(n-1).findFirst().get();
        System.out.println(result);

        // nth smallest number
//        int[] arr={90,89,70,55,91};
//        int smallest=Arrays.stream(arr).sorted().skip(n-1).findFirst().getAsInt();
//        System.out.println(smallest);
    }

/*
find the nth highest length of the word in a sentence
 */
    private static void NthHighestStringWordCount(int n) {
        String str = "I am learning streams api in Java";
        int result = Arrays.stream(str.split(" "))
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(n-1)
                .findFirst().get();
        System.out.println(result);

    }

    /*
    find the occurrence of each word
    Input: String str = "I am learning streams api in Java Java";
    Output: {Java=2, in=1, streams=1, I=1, learning=1, api=1, am=1}
     */

    private static void OccurrenceOfWords() {
        String str = "I am learning streams api in Java Java";

        //approach-1
        Map<String, Long> collect = Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }

    /*
    Find the specified number of vowels.
    if, No of vowels = 2
    String str = "I am learning streams api in Java";
    output : streams, API, Java
     */

    private static void findNumOfVowelsInWords() {
        String str = "I am learning streams api in Java";
//        String s = "Learning";
//        System.out.println(s.replaceAll("[^aeiouAEIOU]", ""));   // ^ - not >>> means, if this "learning" is not aeiou then fill this with "" empty string
        String collect = Arrays.asList(str.split(" ")).stream().filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2).collect(Collectors.joining(", "));
        System.out.println(collect);
    }

    /*
      Given a list of integers, divide it into two lists one having an even number and the other having odd number
      Input : int[] num = {1,2,3,4,5,6,7,8,9,10}
      Output: [[1,3,5,7,9],[2,4,6,8]]
     */
    private static void separateEvenAndOddNum() {

        // approach -1
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        List<List<Integer>> partitionedByEvenOdd = Arrays.stream(num)
                .boxed()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0))
                .entrySet().stream()
                .map(x -> x.getValue())
                .collect(Collectors.toList());
        System.out.println(partitionedByEvenOdd);

        // approach -2
        // instead of doing entrySet then stream and get values, we can get all values directly using values()
        List<List<Integer>> evenOddList = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .values().stream().toList();
        System.out.println(evenOddList);

    }

    /*
    Find the occurrence of each character
    Input: Mississippi
     */
    private static void OccurrenceOfCharacters() {
        String s = "Mississippi";
        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    /*
    find the sum of unique elements
    Input: int[] arr = {1,1,6,7,8,8,3,7,4};
    Output: 29
     */
    private static void sumOfUniqueElements() {
        int[] arr = {1,1,6,7,8,8,3,7,4};

        // approach -1
        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);

        // approach -2
        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr)
                .boxed()
                .filter(set::add)  //set stores unique elements
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }

    /*
    Find the first non-repeated characters
    Input: String s = "Hello world"
    Output: H
     */
    private static void findFirstNonRepeatedChar() {
        String s = " HelloH world";

        String str = " Helloworld";
        String sNew = str.replaceAll(" ", "");  // remove the space so that we won't get space as a first non-repeating char
        // approach -1
        String firstNonRepeat = Arrays.stream(sNew.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
//                .skip(0)
                .findFirst()
                .get();
        System.out.println(firstNonRepeat);

        // approach -2
        Character firstNonRepeat1 = s.chars().mapToObj(x -> (char) x)
                .filter(x->x!=' ')   // remove space
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();
        System.out.println(firstNonRepeat1);

        // approach -3
        String a = Arrays.stream(s.split(""))
                .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst().get();
        System.out.println(a);


    }

    /*
    Find the first repeated character
    Input: String s = "Hello world"
    Output: l
     */
    private static void findFirstRepeatedChar() {
        String s = "He  llo world";
        Character c = s.chars().mapToObj(x -> (char) x)
                .filter(x->x!=' ')
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().get();
        System.out.println(c);
    }


}
