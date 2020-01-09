package org.javaboy.vhr.service;

import org.javaboy.vhr.model.Salary;

import java.util.List;

public interface ISalaryService {
    List<Salary> getAllSalaries();

    Integer addSalary(Salary salary);

    Integer deleteSalaryById(Integer id);

    Integer updateSalaryById(Salary salary);
}
