package com.junstargram.repository

import com.junstargram.entity.Post

interface PostRepository {

    /**
     * 게시글 작성
     */
    fun save(post: Post): Long

    /**
     * 게시글 목록 조회
     */
    fun findByMemberWithPage(uid: Long, page: Int): List<Post>

}