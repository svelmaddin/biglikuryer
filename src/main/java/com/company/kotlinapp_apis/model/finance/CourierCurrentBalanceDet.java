package com.company.kotlinapp_apis.model.finance;

import jakarta.persistence.*;
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
public class CourierCurrentBalanceDet {

    @Id
    private Long id;
    private Double price;
    private String date;
    private Long courierId; //
    private Long shopId; //
    private String time;
}
