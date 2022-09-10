package com.junstargram.repository

import com.junstargram.entity.Member
import com.junstargram.entity.Post
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
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
internal class PostRepositoryImplTest {

    @Autowired
    lateinit var em: EntityManager

    @Autowired
    lateinit var postRepository: PostRepository

    @Test
    fun 게시글_작성() {
        // given
        val createMember = Member.createMember("test", "test", "홍길동", "010-1111-2222", "test@test.com", null, null)
        val createPost = Post.createPost("post test", createMember)

        // when
        val postId = postRepository.save(createPost)

        // then
        Assertions.assertEquals(postId, createPost.postId)

    }

    @Test
    fun 게시글_조회() {
        // given
        val createMember = Member.createMember("test", "test", "홍길동", "010-1111-2222", "test@test.com", null, null)

        val createPost1 = Post.createPost("post test 1", createMember)
        val createPost2 = Post.createPost("post test 2", createMember)
        val createPost3 = Post.createPost("post test 3", createMember)
        val createPost4 = Post.createPost("post test 4", createMember)
        val createPost5 = Post.createPost("post test 5", createMember)
        val createPost6 = Post.createPost("post test 6", createMember)

        postRepository.save(createPost1)
        postRepository.save(createPost2)
        postRepository.save(createPost3)
        postRepository.save(createPost4)
        postRepository.save(createPost5)
        postRepository.save(createPost6)

        // when
        postRepository.findByMemberWithPage(createMember.uid ?: -1, 5)

        // then

    }

}