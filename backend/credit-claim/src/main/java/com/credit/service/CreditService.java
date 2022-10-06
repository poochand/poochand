package com.credit.service;

import com.credit.entity.CreditClaimEntity;
import com.credit.entity.CreditParamsEntity;
import com.credit.model.CreditClaim;
import com.credit.repository.CreditClaimRepository;
import com.credit.repository.CreditParamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class CreditService {


    @Autowired
    private CreditClaimRepository claimRepository;

    @Autowired
    private CreditParamRepository creditParamRepository;


    public boolean hasCreditParam() {

        CreditParamsEntity paramsEntity = creditParamRepository.fetchCreditParam();
        if(paramsEntity==null)
            return false;
        return true;

    }


    public CreditClaim fetchCreditClaim() {

        CreditClaimEntity creditClaimEntity = claimRepository.fetchRecordWithMaxDate();
        CreditParamsEntity paramsEntity = creditParamRepository.fetchBICRecord();

        return generateCreditClaim(creditClaimEntity,paramsEntity);
    }

    private CreditClaim generateCreditClaim(CreditClaimEntity creditClaimEntity, CreditParamsEntity paramsEntity) {
        if(creditClaimEntity==null)
            return null;

        CreditClaim creditClaim=new CreditClaim();
        creditClaim.setValueR(paramsEntity!=null?paramsEntity.getValeur():null);
        creditClaim.setIdFlux(creditClaimEntity.getIdFlux());
        creditClaim.setDateCreateFlux((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntity.getDateCreateFlux()));
        creditClaim.setDateValueFlux((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntity.getDateValueFlux()));
        creditClaim.setNumFlux(creditClaimEntity.getNumFlux());
        creditClaim.setAmhDateSend((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntity.getAmhDateSend()));
        creditClaim.setAmhDateBack((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntity.getAmhDateBack()));
        creditClaim.setAmhStatus(creditClaimEntity.getAmhStatus());
        creditClaim.setEcmsDateSend((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntity.getEcmsDateSend()));
        creditClaim.setEcmsDateBack((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntity.getEcmsDateBack()));
        creditClaim.setEcmsStatus(creditClaimEntity.getEcmsStatus());
        creditClaim.setNumberTricpLoan(creditClaimEntity.getNumberTricpLoan());
        creditClaim.setAmountTricpLoan(creditClaimEntity.getAmountTricpLoan());
        creditClaim.setNumberLoansEligible(creditClaimEntity.getNumberLoansEligible());
        creditClaim.setAmountLoansEligible(creditClaimEntity.getAmountLoansEligible());
        creditClaim.setNumberCCR(creditClaimEntity.getNumberCCR());
        creditClaim.setAmountCCR(creditClaimEntity.getAmountCCR());
        creditClaim.setNumberCCU(creditClaimEntity.getNumberCCU());
        creditClaim.setAmountCCU(creditClaimEntity.getAmountCCU());

        creditClaim.setNumberCCOAU(creditClaimEntity.getNumberCCOAU());
        creditClaim.setAmountCCOAU(creditClaimEntity.getAmountCCOAU());
        creditClaim.setNumberMob(creditClaimEntity.getNumberMob());
        creditClaim.setAmountMob(creditClaimEntity.getAmountMob());
        creditClaim.setNumberDemob(creditClaimEntity.getNumberDemob());
        creditClaim.setAmountDemob(creditClaimEntity.getAmountDemob());
        creditClaim.setNumberRR(creditClaimEntity.getNumberRR());
        creditClaim.setNumberRU(creditClaimEntity.getNumberRU());
        creditClaim.setNumberEvent(creditClaimEntity.getNumberEvent());
        creditClaim.setAmountEvent(creditClaimEntity.getAmountEvent());
        creditClaim.setNumberLoanTricp(creditClaimEntity.getNumberLoanTricp());
        creditClaim.setAmountLoanTricp(creditClaimEntity.getAmountLoanTricp());
        creditClaim.setNumberLoanAcc(creditClaimEntity.getNumberLoanAcc());
        creditClaim.setAmountLoanAcc(creditClaimEntity.getAmountLoanAcc());

        creditClaim.setNumberLoanLIQ(creditClaimEntity.getNumberLoanLIQ());
        creditClaim.setNumberLoanSLS(creditClaimEntity.getNumberLoanSLS());


        return creditClaim;
    }
}
