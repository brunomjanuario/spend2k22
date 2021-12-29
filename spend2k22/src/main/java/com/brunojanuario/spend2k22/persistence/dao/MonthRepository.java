package com.brunojanuario.spend2k22.persistence.dao;

import com.brunojanuario.spend2k22.persistence.model.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<Month, Integer> {
}
