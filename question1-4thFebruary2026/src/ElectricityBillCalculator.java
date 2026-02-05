import java.util.Scanner;

public class ElectricityBillCalculator {
    public static final double COST_PER_KWH=2.0;
    public static void main(String[] args){
        double numApp;
        double consptn;

        double completeCost=0;

        double totalConsumption=0;
        double totalCost=0;


        Scanner input= new Scanner(System.in);
        System.out.println("Please input the total number of appliances");
        numApp= input.nextInt();
        for(int i=1;i<=numApp;i++){
            double surchargeCost=0;
            double baseCost=0;
            System.out.println("Please enter the consumption(kWh) for Appliance"+ i +":");
            consptn= input.nextInt();

            baseCost=consptn * COST_PER_KWH;

            if(consptn>100){
                surchargeCost=baseCost * 0.15;
                baseCost+=surchargeCost;

            }

            totalConsumption+=consptn;
            totalCost+=baseCost;

            System.out.println("APPLIANCE NO. | KWH USED  | SURCHARGE COST | FINAL COST");
            System.out.println(i    +"|" + consptn +"|"+surchargeCost +"|"+baseCost );

        }


        System.out.println("This is your total cost:" + totalCost);
        System.out.println("This is your total consuption:" + totalConsumption);







    }
}