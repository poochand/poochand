package com.credit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name="creditParamsEntity")
@Table(name="CLCM_PARAMS")
public class CreditParamsEntity {

    @Id
    @Column(name="LIB_PARAM")
    private String ligParams;
    @Column(name="DATE_MAJ")
    private Date dateMaj;
    @Column(name="VALEUR")
    private String valeur;

    public String getLigParams() {
        return ligParams;
    }

    public void setLigParams(String ligParams) {
        this.ligParams = ligParams;
    }

    public Date getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(Date dateMaj) {
        this.dateMaj = dateMaj;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}
