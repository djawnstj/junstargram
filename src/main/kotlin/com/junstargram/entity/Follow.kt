package com.junstargram.entity

import javax.persistence.*

@Entity
class Follow protected constructor(
    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "follower")
    val follower: Member,
    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "following")
    val following: Member
): BaseEntity() {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val folId: Long? = null

    companion object {

        /**
         * 생성 메서드
         */
        fun createFollow(follower: Member, following: Member): Follow {
            return Follow(follower, following)
        }

    }

}