package jdbc.example1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomRowMapper implements RowMapper<Player> {

	public Player mapRow(ResultSet rs, int i) throws SQLException {
		System.out.println("mapRow i = " + i);
		Player result = new Player();
		result.setId(rs.getInt("PlayerID"));
		result.setFirstName(rs.getString("FirstName"));
		result.setLastName(rs.getString("LastName"));
		return result;
	}

}
