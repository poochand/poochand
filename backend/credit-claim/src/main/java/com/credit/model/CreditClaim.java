package com.credit.model;


import javax.persistence.Column;

public class CreditClaim {

    private String idFlux;
    private String dateCreateFlux;
    private String dateValueFlux;
    private Long numFlux;
    private String amhDateSend;
    private String amhDateBack;
    private String amhStatus;
    private String ecmsDateSend;
    private String ecmsDateBack;
    private String ecmsStatus;
    private Long numberTricpLoan;
    private Long amountTricpLoan;
    private Long numberLoansEligible;

    private Long amountLoansEligible;
    private Long numberCCR;
    private Long amountCCR;
    private Long numberCCU;
    private Long amountCCU;
    private Long numberCCOAU;
    private Long amountCCOAU;
    private Long numberMob;
    private Long amountMob;
    private Long numberDemob;
    private Long amountDemob;
    private Long numberRR;
    private Long numberRU;
    private Long numberEvent;
    private Long amountEvent;
    private Long numberLoanTricp;
    private Long amountLoanTricp;
    private Long numberLoanAcc;

    private Long amountLoanAcc;
    private String valueR;
    private Long numberLoanLIQ;

    private Long numberLoanSLS;
    private Long numberLoanLIQPrev;

    private Long numberLoanSLSPrev;
    private Long numberLoansEligiblePrev;

    private Long amountLoansEligiblePrev;

    public Long getNumberLoanLIQPrev() {
        return numberLoanLIQPrev;
    }

    public void setNumberLoanLIQPrev(Long numberLoanLIQPrev) {
        this.numberLoanLIQPrev = numberLoanLIQPrev;
    }

    public Long getNumberLoanSLSPrev() {
        return numberLoanSLSPrev;
    }

    public void setNumberLoanSLSPrev(Long numberLoanSLSPrev) {
        this.numberLoanSLSPrev = numberLoanSLSPrev;
    }

    public Long getNumberLoansEligiblePrev() {
        return numberLoansEligiblePrev;
    }

    public void setNumberLoansEligiblePrev(Long numberLoansEligiblePrev) {
        this.numberLoansEligiblePrev = numberLoansEligiblePrev;
    }

    public Long getAmountLoansEligiblePrev() {
        return amountLoansEligiblePrev;
    }

    public void setAmountLoansEligiblePrev(Long amountLoansEligiblePrev) {
        this.amountLoansEligiblePrev = amountLoansEligiblePrev;
    }

    public Long getNumberLoanLIQ() {
        return numberLoanLIQ;
    }

    public void setNumberLoanLIQ(Long numberLoanLIQ) {
        this.numberLoanLIQ = numberLoanLIQ;
    }

    public Long getNumberLoanSLS() {
        return numberLoanSLS;
    }

    public void setNumberLoanSLS(Long numberLoanSLS) {
        this.numberLoanSLS = numberLoanSLS;
    }

    public String getIdFlux() {
        return idFlux;
    }

    public void setIdFlux(String idFlux) {
        this.idFlux = idFlux;
    }

    public String getDateCreateFlux() {
        return dateCreateFlux;
    }

    public void setDateCreateFlux(String dateCreateFlux) {
        this.dateCreateFlux = dateCreateFlux;
    }

    public String getDateValueFlux() {
        return dateValueFlux;
    }

    public void setDateValueFlux(String dateValueFlux) {
        this.dateValueFlux = dateValueFlux;
    }

    public Long getNumFlux() {
        return numFlux;
    }

    public void setNumFlux(Long numFlux) {
        this.numFlux = numFlux;
    }

    public String getAmhDateSend() {
        return amhDateSend;
    }

    public void setAmhDateSend(String amhDateSend) {
        this.amhDateSend = amhDateSend;
    }

    public String getAmhDateBack() {
        return amhDateBack;
    }

    public void setAmhDateBack(String amhDateBack) {
        this.amhDateBack = amhDateBack;
    }

    public String getAmhStatus() {
        return amhStatus;
    }

    public void setAmhStatus(String amhStatus) {
        this.amhStatus = amhStatus;
    }

    public String getEcmsDateSend() {
        return ecmsDateSend;
    }

    public void setEcmsDateSend(String ecmsDateSend) {
        this.ecmsDateSend = ecmsDateSend;
    }

    public String getEcmsDateBack() {
        return ecmsDateBack;
    }

    public void setEcmsDateBack(String emsDateBack) {
        this.ecmsDateBack = emsDateBack;
    }

    public String getEcmsStatus() {
        return ecmsStatus;
    }

    public void setEcmsStatus(String ecmsStatus) {
        this.ecmsStatus = ecmsStatus;
    }

    public Long getNumberTricpLoan() {
        return numberTricpLoan;
    }

    public void setNumberTricpLoan(Long numberTricpLoan) {
        this.numberTricpLoan = numberTricpLoan;
    }

    public Long getAmountTricpLoan() {
        return amountTricpLoan;
    }

    public void setAmountTricpLoan(Long amountTricpLoan) {
        this.amountTricpLoan = amountTricpLoan;
    }

    public Long getNumberLoansEligible() {
        return numberLoansEligible;
    }

    public void setNumberLoansEligible(Long numberLoansEligible) {
        this.numberLoansEligible = numberLoansEligible;
    }

    public Long getAmountLoansEligible() {
        return amountLoansEligible;
    }

    public void setAmountLoansEligible(Long amountLoansEligible) {
        this.amountLoansEligible = amountLoansEligible;
    }

    public Long getNumberCCR() {
        return numberCCR;
    }

    public void setNumberCCR(Long numberCCR) {
        this.numberCCR = numberCCR;
    }

    public Long getAmountCCR() {
        return amountCCR;
    }

    public void setAmountCCR(Long amountCCR) {
        this.amountCCR = amountCCR;
    }

    public Long getNumberCCU() {
        return numberCCU;
    }

    public void setNumberCCU(Long numberCCU) {
        this.numberCCU = numberCCU;
    }

    public Long getAmountCCU() {
        return amountCCU;
    }

    public void setAmountCCU(Long amountCCU) {
        this.amountCCU = amountCCU;
    }

    public Long getNumberCCOAU() {
        return numberCCOAU;
    }

    public void setNumberCCOAU(Long numberCCOAU) {
        this.numberCCOAU = numberCCOAU;
    }

    public Long getAmountCCOAU() {
        return amountCCOAU;
    }

    public void setAmountCCOAU(Long amountCCOAU) {
        this.amountCCOAU = amountCCOAU;
    }

    public Long getNumberMob() {
        return numberMob;
    }

    public void setNumberMob(Long numberMob) {
        this.numberMob = numberMob;
    }

    public Long getAmountMob() {
        return amountMob;
    }

    public void setAmountMob(Long amountMob) {
        this.amountMob = amountMob;
    }

    public Long getNumberDemob() {
        return numberDemob;
    }

    public void setNumberDemob(Long numberDemob) {
        this.numberDemob = numberDemob;
    }

    public Long getAmountDemob() {
        return amountDemob;
    }

    public void setAmountDemob(Long amountDemob) {
        this.amountDemob = amountDemob;
    }

    public Long getNumberRR() {
        return numberRR;
    }

    public void setNumberRR(Long numberRR) {
        this.numberRR = numberRR;
    }

    public Long getNumberRU() {
        return numberRU;
    }

    public void setNumberRU(Long numberRU) {
        this.numberRU = numberRU;
    }

    public Long getNumberEvent() {
        return numberEvent;
    }

    public void setNumberEvent(Long numberEvent) {
        this.numberEvent = numberEvent;
    }

    public Long getAmountEvent() {
        return amountEvent;
    }

    public void setAmountEvent(Long amountEvent) {
        this.amountEvent = amountEvent;
    }

    public Long getNumberLoanTricp() {
        return numberLoanTricp;
    }

    public void setNumberLoanTricp(Long numberLoanTricp) {
        this.numberLoanTricp = numberLoanTricp;
    }

    public Long getAmountLoanTricp() {
        return amountLoanTricp;
    }

    public void setAmountLoanTricp(Long amountLoanTricp) {
        this.amountLoanTricp = amountLoanTricp;
    }

    public Long getNumberLoanAcc() {
        return numberLoanAcc;
    }

    public void setNumberLoanAcc(Long numberLoanAcc) {
        this.numberLoanAcc = numberLoanAcc;
    }

    public Long getAmountLoanAcc() {
        return amountLoanAcc;
    }

    public void setAmountLoanAcc(Long amountLoanAcc) {
        this.amountLoanAcc = amountLoanAcc;
    }

    public String getValueR() {
        return valueR;
    }

    public void setValueR(String valueR) {
        this.valueR = valueR;
    }
}
