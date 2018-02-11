package me.pengliu330.springlearn.anotationbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * Created by peng on 18/2/11.
 */
@Repository
public class LoginDao {
    @Value("test123")
    private String name;

    public String getName(){
        return name;
    }
}
