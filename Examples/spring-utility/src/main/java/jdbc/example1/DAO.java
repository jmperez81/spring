package jdbc.example1;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAO {
	private JdbcTemplate jdbcTemplate;

	public DAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int getInt() {
		return jdbcTemplate.queryForInt("SELECT COUNT(*) FROM Players");
	}
	
	public long getLong() {
		return jdbcTemplate.queryForLong("SELECT COUNT(*) FROM Players");
	}
	
	public Map<String,Object> getMap() {
		return jdbcTemplate.queryForMap("SELECT * FROM Players WHERE PlayerID=?", 1);
	}
	
	public List<Map<String,Object>> getListMap() {
		return jdbcTemplate.queryForList("SELECT * FROM Players");
	}
	
	public Player getModelSingle() {
		return jdbcTemplate.queryForObject("SELECT * FROM Players WHERE PlayerID=?", new CustomRowMapper(), 1);
	}
	
	public List<Player> getModelMultiple() {
		return jdbcTemplate.query("SELECT * FROM Players", new CustomRowMapper());
	}
	
	public void processResults() {
		jdbcTemplate.query("SELECT * FROM Players", new CustomRowCallBackHandler());
	}
	
	public Player extractResults() {
		return jdbcTemplate.query("SELECT * FROM Players", new CustomResultSetExtractor());
	}
}
