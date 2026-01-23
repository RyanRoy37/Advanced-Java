package utiltiy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class Database {
    private static final List<Policyholder> holdersList=new ArrayList<>();
    private static final Set<Integer> policyNumbers= new HashSet<>();
    private static final Map<PolicyType, ArrayList<Policyholder>> policyTypeMap=new HashMap<>();


    public static void addPolicyholder(Policyholder policyholder){
        holdersList.add(policyholder);
        ArrayList<Policyholder> mapList=policyTypeMap.get(policyholder.getPolicyType());
        mapList.add(policyholder);
        //policyTypeMap.put(policyholder.getPolicyType(), ).add(policyholder));
    }
    public static void addPolicyNumber(int policyNumber){
        policyNumbers.add(policyNumber);
    }

    public static boolean uniquePolicy(double number){
        if (policyNumbers.contains(number)){
            return true;
        }
        else
            return false;
    }

    public static String findholder(int policyNumber){
        for (Policyholder policyholder : holdersList) {
            if(policyholder.getPolicyNumber()==policyNumber){
                return policyholder.getHolderName();
            }
        }
        return "No such holder";
    }
    public static List<Policyholder> findholder(PolicyType policyType){
        return policyTypeMap.get(policyType);
    }
    public static void updatePolicyHolder(double number, String newname){
        for (Policyholder policyholder : holdersList) {
            if(policyholder.getPolicyNumber()==number){
                policyholder.setName(newname);
            }
        }
    }

    public static void  deletePolicyHolder(int policyNumber){
        policyNumbers.remove(policyNumber);
        for (Policyholder policyholder : holdersList) {
            if (policyholder.getPolicyNumber()==policyNumber){
                policyTypeMap.remove(policyholder.getPolicyType());
                holdersList.remove(policyholder);
            }
        }
    }

    public static void  deletePolicyHolder(String name){
        for (Policyholder policyholder : holdersList) {
            if (policyholder.getHolderName()==name){
                policyTypeMap.remove(policyholder.getPolicyType());
                holdersList.remove(policyholder);
            }
        }
    }


}

