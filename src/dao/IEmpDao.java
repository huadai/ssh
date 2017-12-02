package dao;

import java.util.List;
import java.util.Map;

import model.Emp;
import model.Emp_his;

public interface IEmpDao {
	
	//����Ա����ż���Ա��
	Emp seleteEmpById(Integer empno);
	//��ȡ����Ա����Ϣ
	List<Emp> selectAllEmp();
	//����������ȡԱ����Ϣ
	List<Emp> selectEmpByOption(Map map);

	//��ɾ����Ա����Ϣ���浽Ա����ʷ����
	int insertEmpHis(Emp_his ehis);
	//ɾ��ָ��Ա��
	int deleteEmp(Emp e);
	//ɾ��ָ��Ա��
	int deleteEmp(Integer empno);
	
}
