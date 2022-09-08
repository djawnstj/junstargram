package com.junstargram.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member: BaseEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val uid: Long? = null
    var memId: String = ""
        private set
    var memPw: String = ""
        private set
    var memName: String = ""
        private set
    var memPhone: String = ""
        private set
    var memEmail: String = ""
        private set
    var memIntroduce: String? = null
        private set
    var memImg: String? = null
        private set
}
