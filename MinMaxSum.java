import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Long> arr) {
        
    Collections.sort(arr);
    long min = arr.get(0)+arr.get(1)+arr.get(2)+arr.get(3);
    long max = arr.get(1)+arr.get(2)+arr.get(3)+arr.get(4);
    System.out.println(min+" "+max);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
