package bo;

import java.util.List;

import model.Emp;

public interface IEmpBo {
	//��ȡ����Ա��
	List<Emp> getEmps();
	//��ȡָ��Ա��
	Emp getEmpById(Integer empno);
	//ɾ��ָ��Ա��,by emp obj;
	int deleteEmp(Emp e);
	//ɾ��ָ��Ա��,by empno
	int deleteEmp(Integer empno);
}
