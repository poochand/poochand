package com.credit.service;

import com.credit.entity.CreditClaimEntity;
import com.credit.entity.CreditParamsEntity;
import com.credit.model.CreditClaim;
import com.credit.repository.CreditClaimRepository;
import com.credit.repository.CreditParamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

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

        List<CreditClaimEntity> creditClaimEntity = claimRepository.fetchRecordWithMaxDate();
        CreditParamsEntity paramsEntity = creditParamRepository.fetchBICRecord();

        return generateCreditClaim(creditClaimEntity.get(0),creditClaimEntity.get(1),paramsEntity);
    }

    private CreditClaim generateCreditClaim(CreditClaimEntity creditClaimEntityMax,CreditClaimEntity creditClaimEntityMaxMinusOne, CreditParamsEntity paramsEntity) {
        if(creditClaimEntityMax==null)
            return null;

        CreditClaim creditClaim=new CreditClaim();
        creditClaim.setValueR(paramsEntity!=null?paramsEntity.getValeur():null);
        creditClaim.setIdFlux(creditClaimEntityMax.getIdFlux());
        creditClaim.setNumberLoanLIQPrev(creditClaimEntityMaxMinusOne.getNumberLoanLIQ());
        creditClaim.setNumberLoanSLSPrev(creditClaimEntityMaxMinusOne.getNumberLoanSLS());
        creditClaim.setNumberLoansEligiblePrev(creditClaimEntityMaxMinusOne.getNumberLoansEligible());
        creditClaim.setAmountLoansEligiblePrev(creditClaimEntityMaxMinusOne.getAmountLoansEligible());
        creditClaim.setDateCreateFlux((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntityMax.getDateCreateFlux()));
        creditClaim.setDateValueFlux((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntityMax.getDateValueFlux()));
        creditClaim.setNumFlux(creditClaimEntityMax.getNumFlux());
        creditClaim.setAmhDateSend((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntityMax.getAmhDateSend()));
        creditClaim.setAmhDateBack((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntityMax.getAmhDateBack()));
        creditClaim.setAmhStatus(creditClaimEntityMax.getAmhStatus());
        creditClaim.setEcmsDateSend((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntityMax.getEcmsDateSend()));
        creditClaim.setEcmsDateBack((new SimpleDateFormat("dd/MM/yyyy")).format(creditClaimEntityMax.getEcmsDateBack()));
        creditClaim.setEcmsStatus(creditClaimEntityMax.getEcmsStatus());
        creditClaim.setNumberTricpLoan(creditClaimEntityMax.getNumberTricpLoan());
        creditClaim.setAmountTricpLoan(creditClaimEntityMax.getAmountTricpLoan());
        creditClaim.setNumberLoansEligible(creditClaimEntityMax.getNumberLoansEligible());
        creditClaim.setAmountLoansEligible(creditClaimEntityMax.getAmountLoansEligible());
        creditClaim.setNumberCCR(creditClaimEntityMax.getNumberCCR());
        creditClaim.setAmountCCR(creditClaimEntityMax.getAmountCCR());
        creditClaim.setNumberCCU(creditClaimEntityMax.getNumberCCU());
        creditClaim.setAmountCCU(creditClaimEntityMax.getAmountCCU());

        creditClaim.setNumberCCOAU(creditClaimEntityMax.getNumberCCOAU());
        creditClaim.setAmountCCOAU(creditClaimEntityMax.getAmountCCOAU());
        creditClaim.setNumberMob(creditClaimEntityMax.getNumberMob());
        creditClaim.setAmountMob(creditClaimEntityMax.getAmountMob());
        creditClaim.setNumberDemob(creditClaimEntityMax.getNumberDemob());
        creditClaim.setAmountDemob(creditClaimEntityMax.getAmountDemob());
        creditClaim.setNumberRR(creditClaimEntityMax.getNumberRR());
        creditClaim.setNumberRU(creditClaimEntityMax.getNumberRU());
        creditClaim.setNumberEvent(creditClaimEntityMax.getNumberEvent());
        creditClaim.setAmountEvent(creditClaimEntityMax.getAmountEvent());
        creditClaim.setNumberLoanTricp(creditClaimEntityMax.getNumberLoanTricp());
        creditClaim.setAmountLoanTricp(creditClaimEntityMax.getAmountLoanTricp());
        creditClaim.setNumberLoanAcc(creditClaimEntityMax.getNumberLoanAcc());
        creditClaim.setAmountLoanAcc(creditClaimEntityMax.getAmountLoanAcc());

        creditClaim.setNumberLoanLIQ(creditClaimEntityMax.getNumberLoanLIQ());
        creditClaim.setNumberLoanSLS(creditClaimEntityMax.getNumberLoanSLS());


        return creditClaim;
    }
}
