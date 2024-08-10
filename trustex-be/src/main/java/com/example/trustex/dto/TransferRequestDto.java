package com.example.trustex.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferRequestDto {
    private Long senderId;
    private Long receiverId;
    private String currencyCode;
    private double amount;
}
