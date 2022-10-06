package com.credit.repository;

import com.credit.entity.CreditParamsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditParamRepository extends JpaRepository<CreditParamsEntity,String> {


    @Query(value = "select * from CLCM_PARAMS where CLCM_PARAMS.VALEUR='NO' and LIB_PARAM='RUN_BATCH'",nativeQuery = true)
    public CreditParamsEntity fetchCreditParam();

    @Query(value = "select * from CLCM_PARAMS where LIB_PARAM='BIC_HSBC'",nativeQuery = true)
    public CreditParamsEntity fetchBICRecord();
}
