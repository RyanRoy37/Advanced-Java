package com.example.PolicyHolder.CRUD.repository;

import com.example.PolicyHolder.CRUD.PolicyHolderCrudApplication;
import com.example.PolicyHolder.CRUD.data.PolicyHolder;
import org.hibernate.id.enhanced.PooledLoOptimizer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PolicyHolderDB {
    private static final Map<Long, PolicyHolder> POLICY_HOLDERS = new HashMap<Long, PolicyHolder>();

    public static PolicyHolder getPolicyHolder(Long id) {
        return POLICY_HOLDERS.get(id);
    }
    public  void addPolicyHolder(PolicyHolder policyHolder) {
        POLICY_HOLDERS.put(policyHolder.getPolicyNumber(),  policyHolder);
    }
    public  void updatePolicyHolder(PolicyHolder policyHolder) {
        POLICY_HOLDERS.put(policyHolder.getPolicyNumber(), policyHolder);
    }
    public  void deletePolicyHolder(Long id) {
        POLICY_HOLDERS.remove(id);
    }
    public  List<PolicyHolder> getPolicyHolders() {
        List<PolicyHolder> policyHolderList= new ArrayList<PolicyHolder>(POLICY_HOLDERS.values());
        return policyHolderList;
    }

}
