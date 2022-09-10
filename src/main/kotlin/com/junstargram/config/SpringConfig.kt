package com.junstargram.config

import com.junstargram.repository.MemberRepository
import com.junstargram.repository.MemberRepositoryImpl
import com.junstargram.repository.PostRepository
import com.junstargram.repository.PostRepositoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.persistence.EntityManager

@Configuration
class SpringConfig(
    val em: EntityManager
) {

//    @Bean
//    fun memberService(): MemberService? {
//        return MemberService(memberRepository())
//    }

    @Bean
    fun memberRepository(): MemberRepository? {
        return MemberRepositoryImpl(em)
    }

    @Bean
    fun postRepository(): PostRepository? {
        return PostRepositoryImpl(em)
    }

}