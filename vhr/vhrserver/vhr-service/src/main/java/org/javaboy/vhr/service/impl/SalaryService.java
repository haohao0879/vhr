package org.javaboy.vhr.service.impl;

import org.javaboy.vhr.mapper.SalaryMapper;
import org.javaboy.vhr.model.Salary;
import org.javaboy.vhr.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SalaryService implements ISalaryService {
    @Autowired
    SalaryMapper salaryMapper;

    @Override
    public List<Salary> getAllSalaries() {
        return salaryMapper.getAllSalaries();
    }

    @Override
    public Integer addSalary(Salary salary) {
        salary.setCreateDate(new Date());
        return salaryMapper.insertSelective(salary);
    }

    @Override
    public Integer deleteSalaryById(Integer id) {
        return salaryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateSalaryById(Salary salary) {
        return salaryMapper.updateByPrimaryKeySelective(salary);
    }
}
