package dao;

import java.util.List;
import java.util.Map;

import model.Emp;
import model.Emp_his;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmpDao implements IEmpDao {

	private HibernateTemplate hibernateTemplate = null;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List<Emp> selectAllEmp() {
		System.out.println("empDao selectAllEmp...");		
		return getHibernateTemplate().find("from Emp");		
	}

	public Emp seleteEmpById(Integer empno) {
		System.out.println("empDao selectEmpByid ... ");
		return this.getHibernateTemplate().get(Emp.class, empno);
	}

	public List<Emp> selectEmpByOption(Map map) {
		return null;
	}

	public int insertEmpHis(Emp_his e) {
		this.getHibernateTemplate().save(e);
		return 1;
	}

	public int deleteEmp(Emp e) {
		this.getHibernateTemplate().delete(e);
		// if(true)	throw new RuntimeException(); //如果此方法出现异常,则整个bo方法自动回滚
		return 1;
	}

	public int deleteEmp(Integer empno) {
		return 0;
	}

}
