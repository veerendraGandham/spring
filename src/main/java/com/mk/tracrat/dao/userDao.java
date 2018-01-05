package com.mk.tracrat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mk.tracrat.command.Command;

@Repository
public class userDao {
@Autowired 
private JdbcTemplate jt;
private static final String INSERT_USER_DETAILS="INSERT INTO LOCATION VALUES(?,?)";
public int userInsert(Command cmd) {
int res=jt.update(INSERT_USER_DETAILS,cmd.getLocatioId() ,cmd.getCompanyId());
	return res;
}
}
