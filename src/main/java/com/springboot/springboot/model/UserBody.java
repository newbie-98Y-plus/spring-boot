package com.springboot.springboot.model;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
@Data
@ConfigurationProperties(prefix = "userbody",ignoreUnknownFields = true)
public class UserBody {
    private String name;
    private String password;
    private String birthday;
    private String mobile;
    private String address;
    @Override
    public String toString() {
        return "UserBody [name=" + name + ", password=" + password + ", birthday=" + birthday + ", mobile=" + mobile
                + ", address=" + address + "]";
    }

}
