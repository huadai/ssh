package bo;

import java.util.List;

import model.Emp;
import model.Emp_his;
import dao.IEmpDao;

public class EmpBo implements IEmpBo {

	private IEmpDao empDao;

	public IEmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}

	public List<Emp> getEmps() {
		System.out.println("empBo getEmps....");
		return empDao.selectAllEmp();		
	}

	public Emp getEmpById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteEmp(Emp e) {		
		return 0;
	}

	public int deleteEmp(Integer empno) {		
		//1,根据id找到员工,
		Emp e = empDao.seleteEmpById(empno);
				
		//2,把员工信息插入his表中
		Emp_his ehis = new Emp_his(e);		
		empDao.insertEmpHis(ehis);
				
		//3.删除员工信息.
		empDao.deleteEmp(e);
		
		return 1;		
		
	}

}
