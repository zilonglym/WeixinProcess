package com.geekxueyuan.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;

public interface UserDao {
	public void save(Connection conn, User user) throws SQLException;
	
	public void update(Connection conn, User user) throws SQLException;
	
	public void delete(Connection conn, User user) throws SQLException;
	
	public ResultSet get(Connection conn, User user) throws SQLException;
	
}
