package com.credit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name="creditClaimEntity")
@Table(name="CLCM_HISTORY_FLUX")
public class CreditClaimEntity {

    @Id
    @Column(name="ID_FLUX")
    private String idFlux;
    @Column(name="DATE_CREATE_FLUX")
    private Date dateCreateFlux;
    @Column(name="DATE_VALUE_FLUX")
    private Date dateValueFlux;
    @Column(name="NUM_FLUX")
    private Long numFlux;
    @Column(name="AMH_DATE_SEND")
    private Date amhDateSend;
    @Column(name="AMH_DATE_BACK")
    private Date amhDateBack;
    @Column(name="AMH_STATUT")
    private String amhStatus;
    @Column(name="ECMS_DATE_SEND")
    private Date ecmsDateSend;
    @Column(name="ECMS_DATE_BACK")
    private Date ecmsDateBack;
    @Column(name="ECMS_STATUT")
    private String ecmsStatus;
    @Column(name="NUNBER_TRICP_LOAN")
    private Long numberTricpLoan;
    @Column(name="AMOUNT_TRICP_LOAN")
    private Long amountTricpLoan;
    @Column(name="NUNBER_LOANS_ELIGIBLE")
    private Long numberLoansEligible;

    @Column(name="AMOUNT_LAONS_ELIGIBLE")
    private Long amountLoansEligible;
    @Column(name="NUNBER_CCR")
    private Long numberCCR;
    @Column(name="AMOUNT_CCR")
    private Long amountCCR;
    @Column(name="NUNBER_CCU")
    private Long numberCCU;
    @Column(name="AMOUNT_CCU")
    private Long amountCCU;
    @Column(name="NUNBER_CCOAU")
    private Long numberCCOAU;
    @Column(name="AMOUNT_CCOAU")
    private Long amountCCOAU;
    @Column(name="NUNBER_MOB")
    private Long numberMob;
    @Column(name="AMOUNT_MOB")
    private Long amountMob;
    @Column(name="NUNBER_DEMOB")
    private Long numberDemob;
    @Column(name="AMOUNT_DEMOB")
    private Long amountDemob;
    @Column(name="NUNBER_RR")
    private Long numberRR;
    @Column(name="NUNBER_RU")
    private Long numberRU;
    @Column(name="NUNBER_EVENT")
    private Long numberEvent;
    @Column(name="AMOUNT_EVENT")
    private Long amountEvent;
    @Column(name="NUNBER_LOAN_TRICP")
    private Long numberLoanTricp;
    @Column(name="AMOUNT_LOAN_TRICP")
    private Long amountLoanTricp;
    @Column(name="NUMBER_LOAN_ACC")
    private Long numberLoanAcc;
    @Column(name="AMOUNT_LOAN_ACC")
    private Long amountLoanAcc;
    @Column(name="NUNBER_LOANS_LIQ")
    private Long numberLoanLIQ;
    @Column(name="NUNBER_LOANS_SLS")
    private Long numberLoanSLS;

    public Long getNumberLoanSLS() {
        return numberLoanSLS;
    }

    public void setNumberLoanSLS(Long numberLoanSLS) {
        this.numberLoanSLS = numberLoanSLS;
    }

    public Long getNumberLoanLIQ() {
        return numberLoanLIQ;
    }

    public void setNumberLoanLIQ(Long numberLoanLIQ) {
        this.numberLoanLIQ = numberLoanLIQ;
    }

    public String getIdFlux() {
        return idFlux;
    }

    public void setIdFlux(String idFlux) {
        this.idFlux = idFlux;
    }

    public Date getDateCreateFlux() {
        return dateCreateFlux;
    }

    public void setDateCreateFlux(Date dateCreateFlux) {
        this.dateCreateFlux = dateCreateFlux;
    }

    public Date getDateValueFlux() {
        return dateValueFlux;
    }

    public void setDateValueFlux(Date dateValueFlux) {
        this.dateValueFlux = dateValueFlux;
    }

    public Long getNumFlux() {
        return numFlux;
    }

    public void setNumFlux(Long numFlux) {
        this.numFlux = numFlux;
    }

    public Date getAmhDateSend() {
        return amhDateSend;
    }

    public void setAmhDateSend(Date amhDateSend) {
        this.amhDateSend = amhDateSend;
    }

    public Date getAmhDateBack() {
        return amhDateBack;
    }

    public void setAmhDateBack(Date amhDateBack) {
        this.amhDateBack = amhDateBack;
    }

    public String getAmhStatus() {
        return amhStatus;
    }

    public void setAmhStatus(String amhStatus) {
        this.amhStatus = amhStatus;
    }

    public Date getEcmsDateSend() {
        return ecmsDateSend;
    }

    public void setEcmsDateSend(Date ecmsDateSend) {
        this.ecmsDateSend = ecmsDateSend;
    }

    public Date getEcmsDateBack() {
        return ecmsDateBack;
    }

    public void setEcmsDateBack(Date ecmsDateBack) {
        this.ecmsDateBack = ecmsDateBack;
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
}
