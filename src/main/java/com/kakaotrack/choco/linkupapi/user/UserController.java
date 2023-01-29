package com.kakaotrack.choco.linkupapi.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:4200"})
@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {
    /*
    로그인한 유저에게만 보이는 controller같음(내추측상)
    아래는 그냥 회원가입, 로그아웃, 로그인 시 없는 아이디 알려주는 내용등...
     */
    private final UserService userService;

    @GetMapping("/signup")
    public String signup(UserCreateForm userCreateForm){
        return "signup_form";
    }

    @PostMapping("/signup")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
            return "signup_form";
        }

        if(!userCreateForm.getPassword().equals(userCreateForm.getPassword2())){
            bindingResult.rejectValue("password2","passwordInCorrect","2개의 패스워드가 일치하지 않습니다.");
            return "signup_form";
        }

        try {
            userService.create(userCreateForm.getUsername(),
                    userCreateForm.getEmail(), userCreateForm.getPassword());
        }catch(DataIntegrityViolationException e) {
            e.printStackTrace();
            bindingResult.reject("signupFailed", "이미 등록된 사용자입니다.");
            return "signup_form";
        }catch(Exception e) {
            e.printStackTrace();
            bindingResult.reject("signupFailed", e.getMessage());
            return "signup_form";
        }

        return "redirect:/";
    }

    /*
    여기는 로그인 폼으로 로그인 페이지로 감.
    참고로 여기 페이지 templates에서 html로 되어있음.
     */
    @GetMapping("/login")
    public String login() {
        return "login_form";
    }


    @GetMapping("/users/{id}")
    public Optional<SiteUser> getById(@PathVariable int id){
        return userService.getById(id);
    }

}
