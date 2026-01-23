package com.example.PolicyHolder.CRUD.data;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class PolicyHolder {

    private Long policyNumber;
    private String name;
    private String policyType;
    private String premium;
    private String duration;

    public PolicyHolder(PostBody postBody) {
        this.policyNumber = postBody.getPolicyNumber();
        this.name = postBody.getName();
        this.policyType = postBody.getPolicyType();
        this.premium = postBody.getPremium();
        this.duration = postBody.getDuration();

    }
}
