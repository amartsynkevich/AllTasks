import java.util.Random;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {
	    Student[] studArray = new Student[5];
        studArray[0]= new Student ("Ivan", "Ivanov");
        studArray[1]= new Student ("Petr", "Petrov");
        studArray[2]= new Student ("Sidor", "Sidorov");
        studArray[3]= new Student ("John", "Smith");
        studArray[4]= new Student ("James", "Bond");

        int[] Results = new int[5];
        Random rnd = new Random();
        for (int i = 0; i < 5; i=i+1)
        {
            Results[i] = rnd.nextInt(5) + 1;
        }


        double average = (double) IntStream.of(Results).sum() / Results.length;
        System.out.print(average);
    }
}
