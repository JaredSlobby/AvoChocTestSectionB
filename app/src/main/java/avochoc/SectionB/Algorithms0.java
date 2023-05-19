package avochoc.SectionB;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithms0 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of numbers to be inputted: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        scanner.close();

        double average = calculateAverage(numbers);
        System.out.println("The average for the " + n + " numbers are : " + average);
    }

    private static double calculateAverage(List<Integer> numbers) 
    {
        int sum = 0;
        for (int num : numbers) 
        {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}
