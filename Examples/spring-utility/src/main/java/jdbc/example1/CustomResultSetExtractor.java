package jdbc.example1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CustomResultSetExtractor implements ResultSetExtractor<Player> {

	public Player extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		Player result = new Player();
		result.setFirstName("");
		result.setLastName("");
		
		while (rs.next()) {
			result.setId(result.getId() + rs.getInt("PlayerID"));
			result.setFirstName(result.getFirstName() + rs.getString("FirstName"));
			result.setLastName(result.getLastName() + rs.getString("LastName"));
		};
		return result;
	}

}
