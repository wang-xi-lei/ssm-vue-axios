package com.wxl.service.impl;

import com.wxl.dao.StuMapper;
import com.wxl.pojo.Stu;
import com.wxl.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuMapper stuMapper;
    @Override
    public List<Stu> queryStuAll() {
        return stuMapper.selectAll();
    }

    @Override
    public Integer addStu(Stu stu) {
        return stuMapper.addStu(stu);
    }

    @Override
    public Integer updateStu(Stu stu) {
        return stuMapper.updateStu(stu);
    }
    @Override
    public Stu selectById(Integer id) {
        return stuMapper.selecStutById(id);
    }

    @Override
    public Integer deleteStu(Integer id) {
        return stuMapper.deleteStu(id);
    }
}
