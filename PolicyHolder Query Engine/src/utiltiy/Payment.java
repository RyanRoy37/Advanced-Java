package utiltiy;

import java.util.Scanner;

public class Payment extends QueryEngine{
    @Override
    public void engine(Scanner input) throws Exception{}
    boolean result;
    @Override
    public boolean engine(Scanner input, Policyholder holder) throws Exception{
        System.out.println("Make Payment for PolicyHolder: " +  holder.getHolderName());
        double premium=Math.random() *(99999 - 9999+ 1)+ 9999;
        System.out.println("Total : " + premium);
        System.out.println("Make payment : 1. Yes   2. No");
        switch (input.nextInt()){
            case 1:
                System.out.println("SIMULATING PAYMENT ....");
                Thread.sleep(2000);
                System.out.println("Payment Succesful");
                holder.setPremium(premium);
                holder.setPolicyNumber();
                holder.setPolicyStatus("active");
                result = true;
                break;
            case 2:
                System.out.println("Payment Failed");
                break;
        }
    return result;
    }
}
