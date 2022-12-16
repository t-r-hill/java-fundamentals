package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demonstrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Exercise_04 {

    public static void main(String[] args) {
        // Qusetion 1
        IntStream.range(1,16).forEach(System.out::println);

        // Question 2
        System.out.println(IntStream.range(4,63).sum());

        // Int array
        Integer[] numsArray = {12,34,56,78,90};

        // Int list
        List<Integer> numsList = new ArrayList<>(Arrays.asList(numsArray));

        // Question 3
        System.out.println(numsList.stream().mapToInt((x) -> x * 2).sum());

        // Question 4
        int answerFour = (int) IntStream.range(1,20).filter((x) -> x > 10).average().orElse(-1);

        //Question 5
        int answerFive = numsList.stream().reduce(0, Integer::sum);

        //Question 6
        String filePath = "src/labs_examples/lambdas/labs/stream_text_lab.csv";

        Path file = Path.of(filePath);

        try(Stream<String> lines = Files.lines(file)){
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Question 7
        try(Stream<String> lines = Files.lines(file)){
            lines
                    .map(x -> x.split(","))
                    .forEach(x -> System.out.println(x[1]));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Question 8
        try(Stream<String> lines = Files.lines(file)){
            lines
                    .mapToInt(x -> Integer.parseInt(x.split(",")[2]))
                    .sum();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Question 9
        boolean hasEven = numsList
                .stream()
                .anyMatch(x -> x % 2 == 0);


        //Question 10
        boolean allEven = numsList
                .stream()
                .allMatch(x -> x % 2 == 0);

        //Question 11 - collect
        try(Stream<String> lines = Files.lines(file)){
            lines
                    .mapToInt(x -> Integer.parseInt(x.split(",")[2]))
                    .boxed()
                    .collect(toCollection(ArrayList::new));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
