package com.lib.project.profile.dao;

import com.lib.project.profile.domain.Notice;

import java.util.List;

public interface INoticeDao {
    public List<Notice> selectNoticeList(Notice notice);
}
