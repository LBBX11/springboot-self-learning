package com.lib.project.profile.domain;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 读取yml文件的配置
 * 将配置文件的属性赋给实体类
 *
 * @Component 可以不需要
 */
@ConfigurationProperties(prefix = "author")
@Component
public class Author {

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
