package utiltiy;

import java.util.Scanner;

public class updatePolicyHolder extends QueryEngine{
    @Override
    public boolean engine(Scanner input, Policyholder holder) throws Exception {
        return false;
    }

    @Override
    public void engine(Scanner input) throws Exception{
        System.out.println("Update Name of Policyholder");
        System.out.println("Enter PolicyNumber");
        double policyNumber = input.nextDouble();
        System.out.println("Enter New Name");
        String newName = input.nextLine();
        Database.updatePolicyHolder(policyNumber, newName);
        System.out.println("Updated Policyholder");
    }
}
