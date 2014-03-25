package jdbc.example1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

public class CustomRowCallBackHandler implements RowCallbackHandler {
	public void processRow(ResultSet rs) throws SQLException {
		System.out.println("processRow() called with rs = " + rs);
	}
}
