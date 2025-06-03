int[] num = {1,2,3,4,5,6,7,8,9,10};
// converting int arr elements to List
List<Integer> collect = Arrays.stream(num).filter(a -> a % 2 == 0)
            .boxed().collect(Collectors.toList());
System.out.println(collect);

->> boxed() is process of converting a primitive type(like int, double, or long) to wrapper class objects(Integer, Double, or Long)

->> mapToObj() is used with primitive streams (IntStream, LongStream, DoubleStream) to convert each element of the stream into an object.
This is an intermediate operation that returns an object-valued Stream<T>
example,
    IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
    // Convert IntStream to Stream<String> using mapToObj
    Stream<String> stringStream = intStream.mapToObj(String::valueOf);

--> chars() - The chars() method converts the string into an IntStream of character codes.
It returns an IntStream of Unicode code points.
It's used to process characters in a string using stream operations.

example,
    String str = "Hello";
    str.chars()
        .forEach(System.out::println);
// output:  72
            101
            108
            108
            111

->> partitioningBy and groupingBy are giving the same results but the different is,
       > partitioningBy() - divide data into two groups based on a given condition
        System.out.println(partitionedByEvenOdd);
       > groupingBy() - In cases where data needs to be divided into more than two categories or if more than two partitions are needed.

Map<Boolean, List<Integer>> partitionedByEvenOdd = Arrays.stream(num).boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0));
System.out.println("Even Numbers: " + partitionedByEvenOdd.get(true));
System.out.println("Odd Numbers: " + partitionedByEvenOdd.get(false));

Map<Boolean, List<Integer>> groupedByEvenOdd = Arrays.stream(num).boxed().collect(Collectors.groupingBy(x -> x % 2 == 0));
System.out.println(groupedByEvenOdd);
System.out.println("Even Numbers: " + groupedByEvenOdd.get(true));
System.out.println("Odd Numbers: " + groupedByEvenOdd.get(false));

->> IntStream() - provides a sequence of primitive int values
difference between range and rangeClosed methods in IntStream?
    > IntStream.range(int startInclusive, int endExclusive) creates a stream of integers starting from startInclusive up to, but not including, endExclusive.
    > In contrast, IntStream.rangeClosed(int startInclusive, int endInclusive) creates a stream of integers starting from startInclusive up to and including endInclusive.

->> allMatch(), checks if all elements in a stream satisfy a given predicate.
It returns true if all elements match the predicate; otherwise, it returns false.
If the stream is empty, allMatch() returns true.

->> Integer.valueOf() Method:
Converts a String representation of an integer to an Integer object.
It can also convert an int to an Integer object.
Example:
    Integer intObject1 = Integer.valueOf("100");
    Integer intObject2 = Integer.valueOf(10);

->> reduce() method in Java is used to perform a reduction operation on the elements of a stream.
It combines the stream elements into a single result by repeatedly applying a binary operation (such as addition, multiplication, or concatenation).
* The identity value acts as the initial value for the reduction and the default result for empty streams.
Syntax:
Optional<T> reduce(BinaryOperator<T> accumulator)
// Returns an Optional to handle the case of an empty stream.
T reduce(T identity, BinaryOperator<T> accumulator)
// Combines elements using the accumulator, starting with the identity. Returns the reduced value directly.
