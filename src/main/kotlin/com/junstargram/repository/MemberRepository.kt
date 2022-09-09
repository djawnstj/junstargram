package com.junstargram.repository

import com.junstargram.entity.Member

interface MemberRepository {

    /**
     * 회원 정보 저장
     */
    fun save(member: Member): Long

    /**
     * 회원 목록 조회
     */
    fun findAll(): List<Member>

    /**
     * uid로 회원 조회
     */
    fun findById(uid: Long): Member

}