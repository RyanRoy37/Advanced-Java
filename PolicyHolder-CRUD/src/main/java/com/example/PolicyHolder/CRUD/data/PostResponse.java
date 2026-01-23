package com.example.PolicyHolder.CRUD.data;

import lombok.Data;

@Data
public class PostResponse {
    private Long policyNumber;
    private String name;
    private String policyType;
    private String premium;
    private String duration;

    public PostResponse(PolicyHolder policyHolder) {
        this.policyNumber = policyHolder.getPolicyNumber();
        this.name = policyHolder.getName();
        this.policyType = policyHolder.getPolicyType();
        this.premium = policyHolder.getPremium();
    }

}
