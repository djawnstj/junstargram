package com.junstargram.config

import com.junstargram.repository.*
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
    fun memberRepository(): MemberRepository = MemberRepositoryImpl(em)

    @Bean
    fun postRepository(): PostRepository = PostRepositoryImpl(em)

    @Bean
    fun followRepository(): FollowRepository = FollowRepositoryImpl(em)

}