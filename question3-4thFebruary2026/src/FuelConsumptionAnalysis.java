import java.util.Scanner;

public class FuelConsumptionAnalysis {
    public static void main(String[] args){
        double fuelUsage;    double highFuel=0;
        double lowFuel=0;
        double normalFuel=0;
        double largest=0;
        double peakDay=0;
        double fuelSum=0;
        double fuelAverage;


        double[] values={12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};


        Scanner input= new Scanner(System.in);

        int i = 0;
        while (i < values.length) {


            if(i>20){
                highFuel++;
            } else if (i>=10 && i<=20) {
                normalFuel++;
            }
            else{
                lowFuel++;
            }

            fuelSum+=values[i];
            if (i < values.length - 1 && values[i] > values[i+1]) {
                peakDay=i;
                largest = values[i];
            }

            i++;
        }
        fuelAverage=fuelSum/ values.length;

        System.out.println("The total sum is " + fuelSum);
        System.out.println("The total sum is " + fuelAverage);
        System.out.println("The peak consumption is"+largest+ "and the peak day is Day" + peakDay);












    }
}
