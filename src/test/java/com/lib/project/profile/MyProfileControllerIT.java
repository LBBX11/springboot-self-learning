package com.lib.project.profile;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
/**
 *自定义属性测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyProfileControllerIT {
    @LocalServerPort
    private int port;

    private URL base;
    @Autowired
    private TestRestTemplate template;


    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/getAuthorInfo");
    }


    @Value("${author.name}")
    private String name;
    @Value("${author.version}")
    private String version;


    @Test
    public void getAuthorInfo() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        System.out.println(response.getBody());
        assertThat(response.getBody(), containsString("libing"));
    }
}
