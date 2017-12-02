package bo;

import java.util.List;

import model.Emp;

public interface IEmpBo {
	//获取所有员工
	List<Emp> getEmps();
	//获取指定员工
	Emp getEmpById(Integer empno);
	//删除指定员工,by emp obj;
	int deleteEmp(Emp e);
	//删除指定员工,by empno
	int deleteEmp(Integer empno);
}
