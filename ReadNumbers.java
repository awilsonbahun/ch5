import java.io.*;
import java.util.Scanner;
//
public class ReadNumbers {
    public static void main(String[]args) throws IOException {
        Scanner inputFile = new Scanner(new File("Book1.csv"));
        inputFile.useDelimiter(",");
        double number, average, sum=0,max=0,min=0;
        while(inputFile.hasNext()) {
            number = Double.parseDouble(inputFile.next());
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        inputFile.close();
        average=sum/10;

        //Write a new testFile

      try(  PrintWriter Writer= new PrintWriter("stats.txt");) {
          Writer.write("The sum of the numbers is: " + sum);
          Writer.write("\nThe lowest number is: " + min);
          Writer.write("\nThe highest number is: " + max);
          Writer.write("\nThe average of the numbers is: " + average);
      }
    }

}
