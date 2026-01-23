package com.example.PolicyHolder.CRUD.services;


import com.example.PolicyHolder.CRUD.data.PolicyHolder;
import com.example.PolicyHolder.CRUD.data.PostBody;
import com.example.PolicyHolder.CRUD.exception.InvalidRequestException;
import com.example.PolicyHolder.CRUD.repository.PolicyHolderDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyHolderService {

    @Autowired
    private static PolicyHolderDB policyHolderDB;

    public  void postValidate(PostBody postBody) {
        if  (postBody == null || postBody.getPolicyType() == null || postBody.getPremium() == null || postBody.getDuration() == null) {
                    throw new InvalidRequestException("Invalid Request");
        }
    }

    public  PolicyHolder updateDB(PostBody postBody) {
        PolicyHolder policyHolder=new PolicyHolder(postBody);
        policyHolderDB.addPolicyHolder(policyHolder);
        return policyHolder;

    }
    public List<PolicyHolder> getallHolders()
    {
        return policyHolderDB.getPolicyHolders();
    }
}
