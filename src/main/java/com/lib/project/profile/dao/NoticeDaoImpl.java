package com.lib.project.profile.dao;

import com.lib.project.profile.dao.INoticeDao;
import com.lib.project.profile.domain.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NoticeDaoImpl implements INoticeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Notice> selectNoticeList(Notice notice) {
        List<Notice> list = jdbcTemplate.query("select * from t_notice", new Object[]{}, new BeanPropertyRowMapper(Notice.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
