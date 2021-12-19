/*================================
 * IBeeDAO.java
 * - 인터페이스
================================*/


package com.test.mvc;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IBeeDAO
{
	public ArrayList<Bee> list() throws SQLException;
	
	public Bee showBee(String beeId) throws SQLException;

	public int add(Bee bee) throws SQLException;
	public int remove(String beeId) throws SQLException;
	public int modify(Bee bee) throws SQLException;
}
