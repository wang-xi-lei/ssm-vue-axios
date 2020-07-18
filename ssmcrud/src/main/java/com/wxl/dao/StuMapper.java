package com.wxl.dao;

import com.wxl.pojo.Stu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface StuMapper extends Mapper<Stu> {
    //删除
    public Integer deleteStu(@Param("id") Integer id);
    //根据id查询
    public Stu selecStutById(@Param("id") Integer id);
    //根据id修改
    public Integer updateStu(Stu stu);
    //添加
    public Integer addStu(Stu stu);
}
