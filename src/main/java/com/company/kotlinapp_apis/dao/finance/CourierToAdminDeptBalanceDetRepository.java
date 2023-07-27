package com.company.kotlinapp_apis.dao.finance;

import com.company.kotlinapp_apis.model.finance.CourierToAdminDeptBalanceDet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierToAdminDeptBalanceDetRepository
        extends JpaRepository<CourierToAdminDeptBalanceDet,Long> {
}
