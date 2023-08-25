package com.umitclebi.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: ucelebi
 * Date: 25.08.2023
 * Time: 10:23
 */
public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
