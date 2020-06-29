package com.lib.project.profile.controller;

import com.lib.project.profile.domain.Author;
import com.lib.project.profile.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *将配置文件的属性赋给实体类
 */
@RestController
@EnableConfigurationProperties({Author.class,User.class})
public class LucyController {
    @Autowired
    private Author author;

    @RequestMapping(value = "/lucy")
    public String lucy(){
        return author.getName()+" >>>>"+author.getAge()+" >>>>"+ author.getVersion();
    }

    @Autowired
    private User user;
    @RequestMapping(value = "/user")
    public String user(){
        return user.getName()+" >>>>"+user.getAge()+" >>>>"+ user.getVersion();
    }

}
