package com.junstargram.entity

import javax.persistence.*

@Entity
class PostTag(
    post: Post,
): BaseEntity() {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val postTagId: Long? = null

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "post_id")
    val post: Post = post

    var postTag: String = ""
        private set

}