package com.junstargram.controller

import com.junstargram.dto.MemberDTO
import com.junstargram.form.LoginForm
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
@RequiredArgsConstructor
class MemberController {

    @GetMapping("/login-form")
    fun loginForm(model: Model): String {
        model.addAttribute("loginForm", LoginForm())
        return "login-form"
    }

    @PostMapping("/login-form")
    fun login(form: LoginForm): String {
        val memberDto = MemberDTO()
        memberDto.uid = 1
        memberDto.memId = form.memId
        memberDto.memPw = form.memPw
        memberDto.memImgPath = ""
        return "redirect:/main"
    }

}