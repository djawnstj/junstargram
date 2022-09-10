package com.junstargram.repository

import com.junstargram.entity.Post
import lombok.RequiredArgsConstructor
import javax.persistence.EntityManager

@RequiredArgsConstructor
class PostRepositoryImpl(
    private val em: EntityManager
): PostRepository {

    /**
     * 게시글 작성
     */
    override fun save(post: Post): Long {
        em.persist(post)
        return post.postId ?: 1
    }

    /**
     * 게시글 목록 조회
     */
    override fun findByMemberWithPage(uid: Long, page: Int): List<Post> {
        return em.createQuery("select p from Post p join Follow f" +
                " on p.postMem = f.following where f.mem.uid = :uid" +
                " order by p.postId desc", Post::class.java)
            .setParameter("uid", uid)
            .setFirstResult(page) // 페이징, 시작
            .setMaxResults(5) // 페이징, 최대 5건
            .resultList
    }

}