package com.github.junit.demo;

import com.github.junit.demo.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerPort;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureStubRunner(stubsMode = StubRunnerProperties.StubsMode.LOCAL, ids = "org.github.junit.demo:provide-e:+:stubs:9999")
public class ContorllerTest extends BaseTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void test() throws Exception {
        System.out.println(1);
        MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.get("/user"))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"k\":1}"))
                .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
//                .andExpect(content().string("{\"k\":1}"));
    }
}
