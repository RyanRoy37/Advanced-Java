package com.example.PolicyHolder.CRUD.controller;


import com.example.PolicyHolder.CRUD.data.PolicyHolder;
import com.example.PolicyHolder.CRUD.data.*;
import com.example.PolicyHolder.CRUD.repository.PolicyHolderDB;
import com.example.PolicyHolder.CRUD.services.PolicyHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policyholder")
public class PolicyHolderCtlr {

  //  @Autowired
    //PolicyHolderDB policyHolderDB;

    @Autowired
    PolicyHolderService policyHolderService;

    @GetMapping
    public List<PolicyHolder> getPolicyHolders() {
        return policyHolderService.getallHolders();
    }

    @PostMapping
    public ResponseEntity<PostResponse> postPolicyHolder(@RequestBody PostBody body){
        policyHolderService.postValidate(body);
        PolicyHolder policyholder=policyHolderService.updateDB(body);
        PostResponse postResponse=new PostResponse(policyholder);
        return ResponseEntity.status(HttpStatus.CREATED).body(postResponse);
    }

}
