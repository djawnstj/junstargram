package com.junstargram.repository

import com.junstargram.entity.Member
import lombok.RequiredArgsConstructor
import javax.persistence.EntityManager

@RequiredArgsConstructor
class MemberRepositoryImpl(
    val em: EntityManager
): MemberRepository {

    /**
     * 회원 정보 수정
     * @return member uid (-1 - if not found member uid)
     *
     */
    override fun save(member: Member): Long {
        em.persist(member)
        return member.uid ?: -1
    }

    /**
     * 회원 목록 조회
     */
    override fun findAll(): List<Member> {
        return em.createQuery("select m from Member m", Member::class.java).resultList
    }

    /**
     * uid로 회원 조회
     */
    override fun findById(uid: Long): Member {
        return em.find(Member::class.java, uid)
    }

}