package com.example.PolicyHolder.CRUD.data;


import lombok.Data;

@Data
public class PostBody {
    private Long policyNumber;
    private String name;
    private String policyType;
    private String premium;
    private String duration;
}
