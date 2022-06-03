package com.example.yamusic;

import com.example.yamusic.entity.User;
import com.example.yamusic.enums.Gender;
import com.example.yamusic.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.soap.Addressing;
import java.util.Date;

@SpringBootTest
class YaMusicApplicationTests {
    @Autowired
    UserRepository repository;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("易");
        user.setNickname("程序猿");
        user.setEnabled(true);
        user.setLocked(true);
        user.setPassword("123456");
        user.setGender(Gender.MALE);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Date());
        User save = repository.save(user);
        System.out.println(save.toString());
        User user1 = repository.getByUsername("易");

        System.out.println(user1.toString());
    }

}
