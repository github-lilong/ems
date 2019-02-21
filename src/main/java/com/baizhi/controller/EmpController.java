package com.baizhi.controller;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @Autowired
    private HttpSession session;
    @RequestMapping("/getAll")
    public Object getAll(){
        List<Emp> list = empService.getAll();
        session.setAttribute("list",list);
        return "emplist";
    }
    @RequestMapping("/login")
    public Object login(Emp emp){
        Emp e = empService.getByUsername(emp.getUsername());
        if(e==null||!e.getPassword().equals(emp.getPassword())){
            return "login";
        }else{
            return "redirect:/emp/getAll";
        }
    }
    @RequestMapping("/regist")
    public Object regist(Emp emp,String safeCode){
        String code=(String)session.getAttribute("code");
        System.out.println("----code:-----"+code);
        if(!safeCode.equals(code)){
            return "regist";
        }else{
            empService.add(emp);
            return "login";
        }
    }
    @RequestMapping("/add")
    public Object add(Emp emp){
        empService.add(emp);
        return "redirect:/emp/getAll";
    }
    @RequestMapping("/remove")
    public Object remove(Integer id){
        empService.remove(id);
        return "redirect:/emp/getAll";
    }
    @RequestMapping("/selectById")
    public Object selectById(Integer id){
        Emp emp = empService.getById(id);
        session.setAttribute("emp",emp);
        return "updateEmp";
    }
    @RequestMapping("/modify")
    public Object modify(Emp emp){
        empService.modify(emp);
        return "redirect:/emp/getAll";
    }
}
