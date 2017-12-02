package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bo.IEmpBo;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IEmpBo empBo = (IEmpBo)context.getBean("empBo");
				
		empBo.deleteEmp(7369);
		
	}	

}
