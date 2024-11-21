package com.test.transaction_management.entity.jpa;


import com.test.transaction_management.entity.dto.SubTotal;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "tbl_transaction_history")
public class TransactionHistory extends AuditEntity{

    @Id
    @Column(columnDefinition = "serial")
    private Long id;
    @JoinColumn(name = "category_id")
    private List<SubTotal> subTotals;
    private Long userId;
    private Long total;



}
