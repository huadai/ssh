package dao;

import java.util.List;
import java.util.Map;

import model.Emp;
import model.Emp_his;

public interface IEmpDao {
	
	//根据员工编号检索员工
	Emp seleteEmpById(Integer empno);
	//获取所有员工信息
	List<Emp> selectAllEmp();
	//根据条件获取员工信息
	List<Emp> selectEmpByOption(Map map);

	//把删除的员工信息保存到员工历史表中
	int insertEmpHis(Emp_his ehis);
	//删除指定员工
	int deleteEmp(Emp e);
	//删除指定员工
	int deleteEmp(Integer empno);
	
}
