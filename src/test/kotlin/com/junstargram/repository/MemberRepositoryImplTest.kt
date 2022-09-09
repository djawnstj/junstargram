package com.junstargram.repository

import com.junstargram.entity.Member
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager

@RunWith(SpringRunner::class)
@SpringBootTest
@Transactional
internal class MemberRepositoryImplTest {

    @Autowired lateinit var em: EntityManager

    @Autowired lateinit var memberRepository: MemberRepository

    @Test
    fun 회원저장() {
        // given
        val createMember = Member.createMember("test", "test", "홍길동", "010-1111-2222", "test@test.com", null, null)

        // when
        memberRepository.save(createMember)
        val foundMember = memberRepository.findById(createMember.uid ?: -1)

        // then
        Assertions.assertEquals(createMember.uid, foundMember.uid)

    }

}