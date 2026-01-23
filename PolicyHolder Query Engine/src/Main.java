import java.util.Scanner;
import utiltiy.*;
public class Main{
    public static void main(String[] args){

        final Scanner input = new Scanner(System.in);
        while(true){
            System.out.println(" POLICYHOLDER SYSTEM");
            System.out.println("SERVCIES:");
            System.out.println("1. New Policyholder");
            System.out.println("2. Find Policyholder");
            System.out.println("3. Update Policyholder");
            System.out.println("4. Delete Policyholder");
            System.out.println("5. Exit");
            int number = input.nextInt();
            switch(number){
                case 1:
                    try {
                        new newPolicyHolder().engine(input);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    try{
                        new findPolicyHolder().engine(input);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    try {

                        new updatePolicyHolder().engine(input);
                    }
                    catch(Exception e) {
                        throw new RuntimeException();
                    }
                        break;

                case 4:
                    try {
                      new  deletePolicyHolder().engine(input);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    break;

            }
        }
    }
}