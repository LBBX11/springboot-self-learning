package com.lib.project.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定义属性
 */
@RestController
public class MyProfileController {
    @Value("${author.name}")
    private String name;
    @Value("${author.version}")
    private String version;

    @GetMapping("/getAuthorInfo")
    public  String getAuthorInfo(){
        return name+"-"+version;
    }
}
