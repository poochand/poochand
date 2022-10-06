package com.credit.controller;

import com.credit.entity.CreditClaimEntity;
import com.credit.model.CreditClaim;
import com.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @GetMapping("/creditparams")
    public ResponseEntity<String> fetchCreditParams(){

        boolean bool=creditService.hasCreditParam();

        if(bool)
            return new ResponseEntity<>("{\"messsage\":\"Record Exist\"}", HttpStatus.OK);

        return new ResponseEntity<>("{\"messsage\":\"Record doesnot exist\"}", HttpStatus.NOT_FOUND);

    }

    @GetMapping("/creditclaim")
    public ResponseEntity<CreditClaim> fetchCreditClaim(){

        CreditClaim creditClaim=creditService.fetchCreditClaim();

        if(creditClaim==null)
            return new ResponseEntity<>(new CreditClaim(), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(creditClaim, HttpStatus.OK);

    }

}
