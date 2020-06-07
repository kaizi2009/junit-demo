package com.github.junit.demo;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.DBUnitExtension;
import com.github.junit.demo.dao.UserDao;
import com.github.junit.demo.entity.User;
import com.github.junit.demo.service.UserService;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.annotation.Resource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("local")
@AutoConfigureMockMvc
//@ExtendWith(DBUnitExtension.class)
//@RunWith(JUnitPlatform.class)
@DBUnit(url = "jdbc:h2:mem:test;MODE=MYSQL;DB_CLOSE_DELAY=-1", driver = "org.h2.Driver", user = "sa")
public class BaseTest {

    @BeforeAll
    @DataSet(value = "datasets/xml/users.xml", disableConstraints = true)
    public static void init() {
        System.out.println("inti data");
    }
}
