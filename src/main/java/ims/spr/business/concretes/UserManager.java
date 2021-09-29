package ims.spr.business.concretes;

import ims.spr.business.abstracts.UserService;
import ims.spr.core.utilities.results.DataResult;
import ims.spr.core.utilities.results.SuccessDataResult;
import ims.spr.dataAccess.abstracts.UserDao;
import ims.spr.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao){
        super();
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Data Listelendi.");
    }

    @Override
    public DataResult<User> getByIsno(long isno) {
        return new SuccessDataResult<User>(this.userDao.getByIsno(isno));
    }
}
