package utiltiy;

import static utiltiy.PolicyType.*;

public class Policyholder {
    private int policyNumber;
    private String holderName;
    private PolicyType policyType;
    private double  premiumAmount;
    private String policyStatus;
    private int policyDuration;

    private Policyholder(String holderName, String policyType, int policyDuration){
        this.holderName = holderName;
        switch(policyType){
            case "HEALTH":
                this.policyType=HEALTH;
                break;
            case "COMMERCIAL":
                this.policyType=COMMERCIAL;
                break;
            case "LIFE":
                this.policyType=LIFE;
                break;
            case "MOTOR":
                this.policyType=MOTOR;
                break;
            case "HOME":
                this.policyType=HOME;
                break;
            case "TRAVEL":
                this.policyType=TRAVEL;
                break;
            default:
                this.policyType=DEFAULT;
                break;
        }
        this.policyDuration = policyDuration;
    }


    public static Policyholder getPolicyHolder(String holderName, String policyType, int policyDuration){
        return new Policyholder(holderName, policyType, policyDuration);
    }

   public void setPolicyNumber(){
        while(true) {
            this.policyNumber = (int) (Math.random() * (9999 - 1 + 1)) + 1;
            if (!Database.uniquePolicy(policyNumber))
            {
                Database.addPolicyNumber(policyNumber);
                break;
            }
        }
   }
   public void setPremium(double amount){
        this.premiumAmount = amount;
   }
   public void setPolicyStatus(String status){
        this.policyStatus = status;
   }

    public int getPolicyNumber() {
        return policyNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setName(String name){
        this.holderName = name;
    }
    public PolicyType getPolicyType() {
        return policyType;
    }
    public double getPremiumAmount() {
        return premiumAmount;
    }
    public String getPolicyStatus() {
        return policyStatus;
    }
    public int getPolicyDuration() {
        return policyDuration;
    }

}
