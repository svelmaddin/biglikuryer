package com.company.kotlinapp_apis.dto.finance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AdminCurrentBalanceDetDto {

    private Long id;
    private Integer price;
    private Long courierId; //
    private Long shopId; //
    private String date;
    private String time;
}
