package container.example9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Class with no default constructors
 * @author Juan Manuel
 *
 */
@Configuration
public class ConfigClass {
	@Bean
	public IFace beanName1() {
		IFaceImpl resultado;
		resultado = new IFaceImpl();
		resultado.setParam3("something");
		return resultado;
	}
}
