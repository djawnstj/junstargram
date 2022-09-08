package com.junstargram.entity

import javax.persistence.*

@Entity
class Post(
    post: String, mem: Member
): BaseEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val postId: Long? = null
    var post: String = post
        private set
    @OneToOne
    @JoinColumn(name = "uid")
    var postMem: Member = mem
        private set


    fun writePost(post: String) {
        this.post = post
    }

}