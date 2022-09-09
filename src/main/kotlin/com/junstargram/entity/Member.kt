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
        protected set
    var memPw: String = ""
        protected set
    var memName: String = ""
        protected set
    var memPhone: String = ""
        protected set
    var memEmail: String = ""
        protected set
    var memIntroduce: String? = null
        protected set
    var memImg: String? = null
        protected set

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
