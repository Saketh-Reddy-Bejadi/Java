import java.io.*;
public class SumOfDigitsUsingBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer number: ");
        int number = Integer.parseInt(br.readLine());
        int sum = 0, digit;
        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}

