package com.company.kotlinapp_apis.model.finance;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourierToAdminDeptBalanceDet {
    @Id
    private Long id;
    private Long courierId; //
    private Long shopId; //
    private Double price;
    private String date;
    private String time;
}
