package com.lib.project.profile.service;

import com.lib.project.profile.domain.Notice;

import java.util.List;

public interface INoticeService {
    public List<Notice> selectNoticeList(Notice notice);
}
