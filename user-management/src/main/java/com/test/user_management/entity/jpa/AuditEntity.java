package com.test.user_management.entity.jpa;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@SuperBuilder
@Setter
@Getter
public class AuditEntity implements Serializable {
    private static final long serialVersionUID = -4745494755935282286L;


    protected String createdBy;
    @Column(name = "created_date", updatable = false)
    protected Date createdDate;
    protected String modifiedBy;
    @Column(name = "modified_date")
    protected Date modifiedDate;
    @Column(name = "isDeleted", columnDefinition = "boolean default false")
    protected Boolean isDeleted;
}
