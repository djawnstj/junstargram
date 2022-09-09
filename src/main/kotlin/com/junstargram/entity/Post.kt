package com.junstargram.entity

import javax.persistence.*

import javax.persistence.FetchType.*

@Entity
class Post(
    post: String,
    mem: Member,
    postImg: PostImg
): BaseEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val postId: Long? = null
    var post: String = post
        protected set
    @OneToOne(fetch = LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "post_mem")
    var postMem: Member = Member()
        protected set

    @OneToOne(fetch = LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name="post_img_id")
    var postImg: PostImg = postImg
        protected set

    fun writePost(post: String) {
        this.post = post
    }

}