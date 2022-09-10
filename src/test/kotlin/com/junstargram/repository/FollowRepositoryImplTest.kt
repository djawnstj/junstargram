package com.junstargram.repository

import com.junstargram.entity.Follow
import com.junstargram.entity.Member
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.persistence.EntityManager
import javax.transaction.Transactional

@RunWith(SpringRunner::class)
@SpringBootTest
@Transactional
internal class FollowRepositoryImplTest {

    @Autowired lateinit var em: EntityManager
    @Autowired lateinit var followRepository: FollowRepository

    @Test
    fun 팔로우_저장() {
        // given
        Member()
        Follow.createFollow()
        followRepository.save()

        // when

        // then

    }

}