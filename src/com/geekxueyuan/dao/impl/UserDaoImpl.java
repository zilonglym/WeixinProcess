package com.geekxueyuan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;

import com.geekxueyuan.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(Connection conn, User user) throws SQLException {
		PreparedStatement ps= conn.prepareCall("insert into error_info(ERROR_NO,error_info) values(?,?)");
		ps.setInt(1, 888888);
		ps.setInt(2, 2);
		ps.execute();
	}

	@Override
	public void update(Connection conn, User user) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Connection conn, User user) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultSet get(Connection conn, User user) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
