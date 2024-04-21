package com.example.springbootmysqldocker;


import static org.assertj.core.api.Assertions.assertThat;

import com.example.springbootmysqldocker.repo.StudentRepo;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmokeTest {

    @Autowired
    private StudentRepo studentRepo;

    @Test
    void contextLoads() throws Exception {
        assertThat(studentRepo).isNotNull();
    }
}
