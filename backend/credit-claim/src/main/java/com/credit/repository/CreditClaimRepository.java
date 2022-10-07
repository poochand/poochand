package com.credit.repository;

import com.credit.entity.CreditClaimEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditClaimRepository extends JpaRepository<CreditClaimEntity,String> {



    @Query(value = "select * from CLCM_HISTORY_FLUX order by DATE_CREATE_FLUX desc FETCH FIRST 2 ROWS ONLY ",nativeQuery = true)
    public List<CreditClaimEntity> fetchRecordWithMaxDate() ;



}
