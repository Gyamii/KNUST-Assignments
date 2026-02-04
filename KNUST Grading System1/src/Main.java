import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double exams;
        double assmnt;
        double fees;
        int req1=0;
        int req2=0;
        int fail1=0;
        int fail2=0;


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Exams score:");
        exams=input.nextInt();
        System.out.println("Your score is " + exams);
        System.out.println("Please enter your Assessment score:");
        assmnt=input.nextInt();
        System.out.println("Your score is " + assmnt);
        System.out.println("Please enter the amount you have paid as fees:");
        fees=input.nextInt();
        System.out.println("Your fees paid is " + fees);

        if(exams + assmnt >= 40){
            System.out.println("You have passed");
            req1=1;
            req2=1;
        }

       else if((exams ==25 && assmnt==14) || (exams ==25 && assmnt==14)){

            System.out.println("You have been condoned");
            req1=1;
            req2=1;

        }
       else if (exams ==39 && assmnt==0){
            System.out.println("You have not been condoned. Hence you have failed");
            req2=0;
        }

        if(exams + assmnt <= 38){
            System.out.println("You have failed");


        }


       if((req1==1 && req2==1) && fees==100){
           System.out.println("You have been awarded a certificate");
       }
       else{
           System.out.println("You have not been awarded a certificate");
       }

        if(req1 !=1 && exams< 24 ){
            System.out.println("You failed the exams");
             fail1=1;
        }

        if(req2 !=1 && assmnt < 14){
            System.out.println("You failed the assessment");
             fail2=1;
        }

        if(fail1==1 && fail2==1){
            System.out.println("You failed both exams and assessment. Hence you are repeated");
        }


















    }
}
