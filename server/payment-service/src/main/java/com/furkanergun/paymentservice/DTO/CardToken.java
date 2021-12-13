package com.furkanergun.paymentservice.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CardToken {
    String id;
    Long amount;
    String currency;
}

