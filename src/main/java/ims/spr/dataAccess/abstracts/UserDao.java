package ims.spr.dataAccess.abstracts;

import ims.spr.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User getByIsno(long isno);
    User getAll();
}
