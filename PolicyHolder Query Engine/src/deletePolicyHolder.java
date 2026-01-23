import utiltiy.Database;
import utiltiy.Policyholder;
import utiltiy.QueryEngine;

import java.util.Scanner;

public class deletePolicyHolder extends QueryEngine {
    @Override
    public boolean engine(Scanner input, Policyholder holder) throws Exception {
        return false;
    }

    @Override
    public void engine(Scanner input) throws Exception{
        System.out.println("Delete policy holder by Name(1) or by Policy Number (2)");
        switch (input.nextInt()){
            case 1:
                System.out.println("Enter Policy Holder Name");
                String name = input.nextLine();
                Database.deletePolicyHolder(name);
                System.out.println("Policy Holder Deleted");
                break;
            case 2:
                System.out.println("Enter Policy Number");
                int policyNumber = input.nextInt();
                Database.deletePolicyHolder(policyNumber);
                System.out.println("Policy Holder Deleted");
                break;
                default:
                    System.out.println("Invalid Input");
                    break;

        }

    }
}
