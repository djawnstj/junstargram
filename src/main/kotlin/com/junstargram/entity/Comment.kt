package com.junstargram.entity

import javax.persistence.*
import javax.persistence.FetchType.LAZY

@Entity
class Comment(
    post: Post,
    comMem: Member
): BaseEntity() {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val comId: Long? = null

    @OneToOne(fetch = LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "post_id")
    val post: Post = post

    @OneToOne(fetch = LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "com_mem")
    val comMem: Member = comMem

    var comment: String = ""
        private set

}