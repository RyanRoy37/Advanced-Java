package utiltiy;

import java.util.Scanner;

public class newPolicyHolder  extends QueryEngine {

    public newPolicyHolder() {
    }
    @Override
    public boolean engine(Scanner input, Policyholder holder) throws Exception {
        return false;
    }
    @Override
    public void engine(Scanner input) throws Exception{
        System.out.println("Enter Policy Holder Name:");
        String holderName = input.nextLine();
        input.nextLine();
        System.out.println("Enter Policy Type:");
        String policyType = input.nextLine();
        policyType= policyType.toUpperCase();
        System.out.println("Enter Policy Duration (in months):");
        int policyDuration = input.nextInt();

        Policyholder newholder=Policyholder.getPolicyHolder(holderName, policyType, policyDuration);
        while(true){
            System.out.println("Make Payment for PolicyHolder: " +  newholder.getHolderName());
            System.out.println("1. Confirm, 2. Exit");
            switch (input.nextInt()){
                case 1:
                    boolean paymentResult=new Payment().engine(input, newholder);
                    if (paymentResult){
                        int policyNumber=newholder.getPolicyNumber();
                        System.out.println("Policy Created. Your Policy Number is : " + policyNumber);
                    }
                    else{
                        System.out.println("Payment Failed, Please Try Again");
                    }
                    break;
                case 2:
                    newholder =null;
                    System.out.println("Exiting.");
                    break ;
            }
            if (newholder.getPolicyNumber()>0 || newholder.equals(null)){
                break;
            }
        }


    }
}
