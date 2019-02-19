package com.example.restapplication.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper
{
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFirstname(rs.getString("firstname"));
        user.setLastname(rs.getString("lastname"));
        user.setCity(rs.getString("city"));
        user.setCountry(rs.getString("country"));
        user.setPhoneno(rs.getString("phoneno"));
        user.setEmailid(rs.getString("emailid"));

        return user;
    }

}
