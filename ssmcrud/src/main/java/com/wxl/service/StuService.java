package com.wxl.service;

import com.wxl.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StuService {
    List<Stu>  queryStuAll();
    //添加
    Integer addStu(Stu stu);
    //修改
    Integer updateStu(Stu stu);
    //根据id查询
    Stu  selectById(Integer id);
    //根据id删除
    Integer deleteStu(Integer id);
}
