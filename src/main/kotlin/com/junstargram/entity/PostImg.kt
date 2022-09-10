package com.junstargram.entity

import javax.persistence.*

@Entity
class PostImg(
    imgPath: String,
    post: Post
): BaseEntity() {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val postImgId: Long? = null

    var imgPath :String = imgPath
        protected set

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name="post_id")
    var post: Post = post
        protected set

}