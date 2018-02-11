package me.pengliu330.springlearn.anotationbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by peng on 18/2/11.
 */
@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    public LoginDao getLoginDao() {
        return this.loginDao;
    }
}
