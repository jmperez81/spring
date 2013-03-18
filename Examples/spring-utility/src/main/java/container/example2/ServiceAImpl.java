package container.example2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class ServiceAImpl implements ServiceA {
	
	@Value("#{systemProperties}")
	Map defaultLocale;
	
	public Map getSystemProperties() {
		return defaultLocale;
	}

	@Value("#{systemProperties['user.region']}")
	public void showLocale(String locale1, String locale2) {
		System.out.println(locale1);
		System.out.println(locale2);
	}
}
