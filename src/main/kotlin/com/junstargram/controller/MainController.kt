package com.junstargram.controller

import com.junstargram.entity.Member
import com.junstargram.form.LoginForm
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
@RequiredArgsConstructor
class MainController {

    @GetMapping("/main")
    fun main(model: Model): String {
        model.addAttribute("mem", Member())
//        model.addAttribute("item", Post())
        return "main"
    }

}