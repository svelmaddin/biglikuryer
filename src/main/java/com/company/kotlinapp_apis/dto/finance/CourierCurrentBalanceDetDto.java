package com.company.kotlinapp_apis.dto.finance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CourierCurrentBalanceDetDto {

    private Long id;
    private Double price;
    private Long courierId;
    private Long shopId;
    private String date;
    private String time;
}
