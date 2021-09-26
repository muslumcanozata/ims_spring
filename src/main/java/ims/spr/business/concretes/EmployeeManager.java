package ims.spr.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.spr.business.abstracts.EmployeeService;
import ims.spr.entities.concretes.Employee;
import ims.spr.dataAccess.abstracts.EmployeeDao;
import ims.spr.core.utilities.results.*;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao){
        super();
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "Data Listelendi");
    }

    @Override
    public DataResult<Employee> getByIsno(int isno){
        return new SuccessDataResult<Employee>(this.employeeDao.getByIsno(isno));
    }

    @Override
    public DataResult<Employee> getByRfid(String rfid){
        return new SuccessDataResult<Employee>(this.employeeDao.getByRfid(rfid));
    }

    @Override
    public DataResult<Employee> getByTel(long tel){
        return new SuccessDataResult<Employee>(this.employeeDao.getByTel(tel));
    }
}
