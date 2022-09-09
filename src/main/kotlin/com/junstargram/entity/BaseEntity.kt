package com.junstargram.entity

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity {
    @CreatedBy
    var createBy: String? = null

    @CreatedDate
    @Column(name = "created_at" , nullable = false, updatable = false,  columnDefinition = "DATE")
    var createdAt: LocalDateTime? = LocalDateTime.now()

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "DATE")
    var updatedAt  : LocalDateTime = LocalDateTime.now()

    @LastModifiedBy
    var updateBy: String? = null

}
