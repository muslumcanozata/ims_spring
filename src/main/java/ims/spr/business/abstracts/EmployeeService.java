package ims.spr.business.abstracts;

import ims.spr.core.utilities.results.DataResult;
import ims.spr.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();

    DataResult<Employee> getByIsno(int isno);

    DataResult<Employee> getByRfid(String rfid);

    DataResult<Employee> getByTel(long tel);
}
