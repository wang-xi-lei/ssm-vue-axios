package com.wxl.controller;
import com.wxl.pojo.Stu;
import com.wxl.response.RespBean;
import com.wxl.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StuController {
    @Autowired
    private StuService stuService;
    @GetMapping("/stuAll")
    public  RespBean queryStuAll(Model model){
        List<Stu> stus = stuService.queryStuAll();
        // model.addAttribute("student",stus);
        return  RespBean.ok("成功",stus);
       // return "index";
    }
    /*
    //添加跳转到添加页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

     */
    //添加
    @PostMapping("/addStu")
    public RespBean addStu(@RequestBody Stu stu){
        Integer integer = stuService.addStu(stu);
        System.out.println(stu.toString());
        if (integer>0){
            return RespBean.ok("添加成功");
        }else {
            return RespBean.error("添加失败");
        }
      //  return "redirect:/stuAll";
    }
    //删除
    @DeleteMapping("/deleteStu/{id}")
    public RespBean deleteStu(@PathVariable("id")Integer id){
        Integer integer = stuService.deleteStu(id);
        if (integer>0){
            return RespBean.ok("删除成功");
        }else {
            return RespBean.error("删除失败");
        }
    }
    //根据id查询 跳转到修改页面
    @RequestMapping("/selectById/{id}")
    public RespBean selectById(@PathVariable("id") Integer id ,Model model){
        Stu stu = stuService.selectById(id);
        //model.addAttribute("stu",stu.getId());
        //System.out.println(stu);
        if (stu!=null){
            return RespBean.ok("查询成功",stu);
        }else {
            return RespBean.error("查询失败");
        }
        //return "update";
    }
    //修改
    @PutMapping("/updateStu")
    public RespBean updateStu(@RequestBody Stu stu){
        Integer integer = stuService.updateStu(stu);
        if (integer>0){
            return RespBean.ok("修改成功");
        }else {
            return RespBean.error("修改失败");
        }
        //return "redirect:/stuAll";
    }

}
