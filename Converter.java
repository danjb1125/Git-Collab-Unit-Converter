
import java.util.*;

public class Converter {
    public static double ConvertMtoKm(double meters) 
    {
        return meters / 1000;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a meter length to convert into kilometers: ");
        double meterLength = input.nextDouble();
        double kilometers = ConvertMtoKm(meterLength);
        System.out.println(meterLength + " meters is equal to " + kilometers + " kilometers.");
        
        input.close();
    }
}

