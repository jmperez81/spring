package aop.intro;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Simple calculator
 * Se piden modificaciones en nuestra calculadora:
 * - Nos piden que logueemos todas las operaciones que hace la calculadora. 
 * - Adem�s, nos piden que si se produce una excepci�n se mande un correo.
 * - Adem�s, piden que s�lo puedan utilizarla administradores en todos los m�todos
 * - Ahora nos piden que lo hagamos para cualquier clase del proyecto... �? �dolor! -> aspectos
 * - Y no s�lo ah� sino en librer�as terceras.... �??? no se puede sin aspectos!
 */
public class Calculator2 {
	
	private Logger log = Logger.getLogger(getClass());
	
	@Autowired
	private SecurityUtils securityUtils;
	
	@Autowired
	private MailUtils mailUtils;
	

	public int div( int op1, int op2){
		log.info("divide method has been invoked");
		try {
			if (securityUtils.isRoleAllowed("ROLE_USER")){
				throw new RuntimeException("Access Denied");
			}
			return op1 / op2;
		} catch(Exception e) {
			mailUtils.sendMail("myAccount@example.com", "Exception in DIV method", e.getMessage());
			throw new RuntimeException("Error ",e);
		}
	}
	
	public int sum( int op1, int op2){
		log.info("divide method has been invoked");
		try {
			if (securityUtils.isRoleAllowed("ROLE_USER")){
				throw new RuntimeException("Access Denied");
			}
			return op1 + op2;
		} catch(Exception e) {
			mailUtils.sendMail("myAccount@example.com", "Exception in SUM method", e.getMessage());
			throw new RuntimeException("Error ",e);
		}
	}
	
	public int sub( int op1, int op2){
		log.info("divide method has been invoked");
		try {
			if (securityUtils.isRoleAllowed("ROLE_USER")){
				throw new RuntimeException("Access Denied");
			}
			return op1 - op2;
		} catch(Exception e) {
			mailUtils.sendMail("myAccount@example.com", "Exception in SUB method", e.getMessage());
			throw new RuntimeException("Error ",e);
		}
	}
	
	public int mult(int op1, int op2){
		log.info("divide method has been invoked");
		try {
			if (securityUtils.isRoleAllowed("ROLE_USER")){
				throw new RuntimeException("Access Denied");
			}
			return op1 * op2;
		} catch(Exception e) {
			mailUtils.sendMail("myAccount@example.com", "Exception in SUB method", e.getMessage());
			throw new RuntimeException("Error ",e);
		}
	}
}
