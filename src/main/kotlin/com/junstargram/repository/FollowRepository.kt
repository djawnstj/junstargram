package com.junstargram.repository

import com.junstargram.entity.Follow
import com.junstargram.entity.Member

interface FollowRepository {

    /**
     * 팔로우 저장 함수
     */
    fun save(follow: Follow): Long

    /**
     * 대상을 팔로우 하고있는 회원 목록 조회
     */
    fun findFollowedById(uid: Long): List<Follow>

    /**
     * 대상이 팔로우 하고있는 회원 목록 조회
     */
    fun findFollowingById(uid: Long): List<Follow>

}