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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    Double positiveCount = 0.0;
    Double negativeCount = 0.0;
    Double zeroCount = 0.0;
    Double posRatio = 0.0;
    Double negRatio = 0.0;
    Double zeroRatio = 0.0;
    int size = arr.size();
    for(Integer num : arr){
        if(num>0){
            positiveCount = positiveCount +1;
        }
        else if(num<0){
            negativeCount = negativeCount +1;
        }
        else{
            zeroCount = zeroCount+1;
        } }
        posRatio = (positiveCount > 0 ) ? (positiveCount/size): 0;
        negRatio = (negativeCount > 0) ? (negativeCount/size) : 0;               zeroRatio= (zeroCount > 0 )? (zeroCount/size) : 0;
        System.out.println(
      String.format("%.6f", posRatio));
        System.out.println(
      String.format("%.6f", negRatio));
        System.out.println(
      String.format("%.6f", zeroRatio));
   

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
