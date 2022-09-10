package com.junstargram.entity

import javax.persistence.*

import javax.persistence.FetchType.*

@Entity
class Post protected constructor(post: String, mem: Member): BaseEntity() {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val postId: Long? = null

    val post: String = post

    @OneToOne(fetch = LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "post_mem")
    val postMem: Member = mem

    companion object {

        /**
         * 게시글 생성 메서드
         */
        fun createPost(post: String, mem: Member): Post {
            return Post(post, mem)
        }

    }

}