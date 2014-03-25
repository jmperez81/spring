package jdbc.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc/example1/spring-config.xml");
		DAO dao = context.getBean(DAO.class);
		System.out.println("int = " + dao.getInt());
		System.out.println("long = " + dao.getLong());
		System.out.println("map = " + dao.getMap());
		System.out.println("listMap = " + dao.getListMap());
		System.out.println("Player = " + dao.getModelSingle());
		System.out.println("Players = " + dao.getModelMultiple());
		dao.processResults();
		System.out.println("Processed players = " + dao.extractResults());
	}
}
