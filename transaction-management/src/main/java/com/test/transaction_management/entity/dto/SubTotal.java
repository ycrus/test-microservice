package com.test.transaction_management.entity.dto;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
public class SubTotal implements Serializable {

    private static final long serialVersionUID = 2224256417469956370L;


    @Id
    @Column(columnDefinition = "serial")
    private Long id;
    private Long transactionId;
    private Long productId;
    private Long quantity;
    private Long subTotal;



}
