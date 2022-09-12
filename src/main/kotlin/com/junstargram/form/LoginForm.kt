package com.junstargram.form

import javax.validation.constraints.NotEmpty

class LoginForm {
    @NotEmpty(message = "ID를 입력하지 않았습니다.")
    lateinit var memId: String
    @NotEmpty(message = "PW를 입력하지 않았습니다.")
    lateinit var memPw: String
}