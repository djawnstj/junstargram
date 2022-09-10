package com.junstargram.repository

import com.junstargram.entity.Follow
import com.junstargram.entity.Member
import lombok.RequiredArgsConstructor
import javax.persistence.EntityManager

@RequiredArgsConstructor
class FollowRepositoryImpl(
    private val em: EntityManager
): FollowRepository {

    /**
     * 팔로우 저장 함수
     */
    override fun save(follow: Follow): Long {
        em.persist(follow)
        return follow.folId ?: -1
    }

    /**
     * 대상을 팔로우 하고있는 회원 목록 조회
     */
    override fun findFollowedById(uid: Long): List<Follow> {
        return em.createQuery("select f from Follow f where f.mem.uid = :uid", Follow::class.java)
            .setParameter("uid", uid).resultList
    }

    /**
     * 대상이 팔로우 하고있는 회원 목록 조회
     */
    override fun findFollowingById(uid: Long): List<Follow> {
        return em.createQuery("select f from Follow f where f.following.uid = :uid", Follow::class.java)
            .setParameter("uid", uid).resultList
    }

}