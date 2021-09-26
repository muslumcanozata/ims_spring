package ims.spr.dataAccess.abstracts;

import ims.spr.entities.concretes.Employee;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
    Employee getByIsno(int isno);
    Employee getByRfid(String rfid);
    Employee getByTel(long tel);
}
