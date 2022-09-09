package com.junstargram.entity

import javax.persistence.*

@Entity
class PostLike(
    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "post_id")
    val likePost: Post,
    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "like_mem")
    val likeMem: Member
): BaseEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val likeId: Long? = null
}