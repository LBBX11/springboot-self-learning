package com.lib.project.profile.controller;

import com.lib.project.profile.domain.Notice;
import com.lib.project.profile.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 通过spring的JdbcTemplate去访问关系型mysql
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private INoticeService noticeService;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<Notice> getAccounts(Notice notice){
        return noticeService.selectNoticeList(notice);
    }
}
