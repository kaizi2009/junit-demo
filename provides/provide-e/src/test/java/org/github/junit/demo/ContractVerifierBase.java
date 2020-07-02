package org.github.junit.demo;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = {TestApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
//@ExtendWith(DBUnitExtension.class)
//@RunWith(JUnitPlatform.class)
@RunWith(SpringRunner.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ContractVerifierBase {
    @Autowired
    private WebApplicationContext applicationContext;
    @Before
    public void setup() {
        RestAssuredMockMvc.webAppContextSetup(applicationContext);
        //RestAssuredMockMvc.standaloneSetup(goodsController); 也可以使用standaloneSetup启动单个controller。
    }
}
