package utiltiy;

import java.util.Scanner;

import static utiltiy.PolicyType.*;
import static utiltiy.PolicyType.DEFAULT;
import static utiltiy.PolicyType.HOME;
import static utiltiy.PolicyType.MOTOR;
import static utiltiy.PolicyType.TRAVEL;

public class findPolicyHolder extends QueryEngine {
    @Override
    public boolean engine(Scanner input, Policyholder holder) throws Exception {
        return false;
    }
    @Override
    public void engine(Scanner input) throws Exception {
        System.out.println("Find policy by PolicyNumber(1), PolicyType(2)");
        while (true) {
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Enter PolicyNumber");
                    int policyNumber = input.nextInt();
                    System.out.println(Database.findholder(policyNumber));
                    break;
                    case 2:
                        PolicyType policyType;
                        System.out.println("Enter Policytype");
                        String policytypeInput = input.nextLine();
                        switch(policytypeInput){
                            case "HEALTH":
                                policyType=HEALTH;
                                break;
                            case "COMMERCIAL":
                                policyType=COMMERCIAL;
                                break;
                            case "LIFE":
                                policyType=LIFE;
                                break;
                            case "MOTOR":
                                policyType=MOTOR;
                                break;
                            case "HOME":
                                policyType=HOME;
                                break;
                            case "TRAVEL":
                                policyType=TRAVEL;
                                break;
                            default:
                                policyType=DEFAULT;
                                break;
                        }
                        System.out.println(Database.findholder(policyType));
                        break;
                default:
                            break;
            }
            break;
        }
    }
    public findPolicyHolder() {}

}
