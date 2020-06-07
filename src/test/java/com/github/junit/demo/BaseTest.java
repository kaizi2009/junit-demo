package com.github.junit.demo;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.DBUnitExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TestApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ExtendWith(DBUnitExtension.class)
@RunWith(JUnitPlatform.class)
public abstract class BaseTest {
    @BeforeEach
    @DataSet(value = "datasets/xml/users.xml")
    public void init() {
        System.out.println("inti data");
    }

    @BeforeAll
    public static void setup() {
        System.out.println("setup");
    }
}


