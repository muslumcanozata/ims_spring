package ims.spr.business.abstracts;

import ims.spr.core.utilities.results.DataResult;
import ims.spr.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    DataResult<List<User>> getAll();

    DataResult<User> getByIsno(long isno);
}
