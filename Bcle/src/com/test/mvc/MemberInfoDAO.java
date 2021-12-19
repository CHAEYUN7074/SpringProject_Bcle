package com.test.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class MemberInfoDAO implements IMemberInfoDAO
{
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	// 멤버 리스트
	@Override
	public ArrayList<MemberInfo> list() throws SQLException
	{
		ArrayList<MemberInfo> result = new ArrayList<MemberInfo>();
		
		return result;
	}
	
	// 카테고리 리스트 
	/*
	@Override
	public ArrayList<Category> categortyList() throws SQLException
	{
		ArrayList<Category> result = new ArrayList<Category>();
		
		return result;
	}
	*/
	
	// 멤버 추가 
	@Override
	public int memberInfoAdd(MemberInfo memberInfo) throws SQLException
	{
		int result = 0;
		
		return result;
	}
	
	// 멤버 삭제
	@Override
	public int remove(String employeeId) throws SQLException
	{
		int result = 0;
		
		return result;
	}
	
	// 멤버 변경
	@Override
	public int modify(MemberInfo memberInfo) throws SQLException
	{
		int result = 0;
		
		return result;
	}
	
	// 아이디로 직원을 검색하는 메소드 
	/*
	@Override
	public MemberInfoDAO searchId(String id) throws SQLException
	{
		
	}
	*/
	
	public String login(String userId, String pwd) throws SQLException
	{
		String result = null;
		
		Connection conn = dataSource.getConnection();
		
		String sql = "SELECT ID FROM MEMBERINFO WHERE USERID=? AND PWD=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, pwd);
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next())
			result = rs.getString("ID");
		rs.close();
		pstmt.close();
		conn.close();
		
		return result;
	}
	
	
	// 관리자 로그인
	@Override
	public String logAdmin(String name, String pwd) throws SQLException
	{
		String result = null;
		
		Connection conn = dataSource.getConnection();
		
		String sql = "SELECT ADMIN_ID FROM ADMIN WHERE NAME=? AND PWD=?";		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(name));
		pstmt.setString(2, pwd);
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next())
			result = rs.getString("adminId");
		rs.close();
		pstmt.close();
		conn.close();
		
		return result;
	}

	@Override
	public MemberInfo searchId(String id) throws SQLException
	{
		MemberInfo result = new MemberInfo();
		
		Connection conn = dataSource.getConnection();
		
		String sql = "SELECT NICKNAME FROM MEMBERINFO WHERE ID = ?";		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next())
			result.setNickname(rs.getString("NICKNAME")); 
		rs.close();
		pstmt.close();
		conn.close();
		
		return result;
	}

	
		
		
	
	
}
