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
    @Autowired lateinit var memberRepository: MemberRepository

    @Test
    fun 팔로우_저장() {
        // given
        val createMember1 = Member.createMember("test1", "test", "홍길동1", "010-1111-2222", "test@test.com", null, null)
        val createMember2 = Member.createMember("test2", "test", "홍길동2", "010-1111-2222", "test@test.com", null, null)

        memberRepository.save(createMember1)
        memberRepository.save(createMember2)

        val createFollow = Follow.createFollow(createMember1, createMember2)

        // when
        followRepository.save(createFollow)

        // then

    }

}