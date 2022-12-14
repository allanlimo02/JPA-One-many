package com.example.Foreign.Keys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.sql.rowset.spi.SyncResolver;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderResponse {
    private String name;
    private String productName;
}
