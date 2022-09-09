package com.junstargram.entity

import javax.persistence.*

@Entity
class Follow(
    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "mem_id")
    val mem: Member,
    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "following")
    val following: Member
): BaseEntity() {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val folId: Long? = null

}