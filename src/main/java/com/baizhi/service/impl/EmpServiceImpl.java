package com.baizhi.service.impl;
import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDAO empDAO;
    @Override
    public Emp getByUsername(String username) {
        return empDAO.select(username);
    }
    @Override
    public List<Emp> getAll() {
        return empDAO.selectAll();
    }
    @Override
    public void add(Emp emp) {
        empDAO.insert(emp);
    }
    @Override
    public void remove(Integer id) {
        empDAO.delete(id);
    }
    @Override
    public Emp getById(Integer id) {
        return empDAO.selectById(id);
    }
    @Override
    public void modify(Emp emp) {
        empDAO.update(emp);
    }
}
