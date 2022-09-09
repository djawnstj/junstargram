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

    companion object {
        
        //=============== 생성 메서드 ===============//
        fun createMember(memId: String, memPw: String, memName: String, memPhone: String, memEmail: String, memIntroduce: String?, memImg: String?): Member {
            val member = Member()
            member.memId = memId
            member.memPw = memPw
            member.memName = memName
            member.memPhone = memPhone
            member.memEmail = memEmail
            member.memIntroduce = memIntroduce
            member.memImg = memImg

            return member
        }
        
    }
    
}
