package com.kakaotrack.choco.linkupapi.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    /*
    아이디랑 비밀번호 불러왔네요...
    그리고 SiteUser 생성시켰어요.
    이름(무슨 이름이지), 이메일, 비밀번호
    그럼 이게 CURD C부분이 맞는거 같은데 이제 여기에
    READ하는게 아닐까요?
     */
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password){
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;
    }
}
