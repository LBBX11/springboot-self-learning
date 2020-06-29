package com.lib.project.profile.domain;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 自定义配置文件
 * 读取properties文件的配置
 */
@Configuration
@PropertySource(value = "classpath:application-test.yml")
@ConfigurationProperties(prefix = "author2")
public class User {

    private String name;
    private int age;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", version='" + version + '\'' +
                '}';
    }
}
