package com.junstargram.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PostImg(
    val imgPath :String
): BaseEntity() {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val postImgId: Long? = null

}