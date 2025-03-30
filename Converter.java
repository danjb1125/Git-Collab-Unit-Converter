public class Converter 
{
    public static double ConvertMtoKm(double meters) 
    {
        return meters / 1000;
    }
    
    public static void main (String[] args) 
    {
        double meters = 1000;
        double kilometers = ConvertMtoKm(meters);
        System.out.println(meters + " meters is equal to " + kilometers + " kilometers.");
    }
}