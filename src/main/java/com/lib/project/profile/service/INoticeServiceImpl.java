package com.lib.project.profile.service;

import com.lib.project.profile.dao.INoticeDao;
import com.lib.project.profile.domain.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INoticeServiceImpl implements INoticeService {
    @Autowired
    INoticeDao noticeDao;
    @Override
    public List<Notice> selectNoticeList(Notice notice) {
        return noticeDao.selectNoticeList(notice);
    }
}
