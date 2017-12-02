package action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import model.Emp;
import bo.IEmpBo;

public class EmpAction {
	
	//����
	private Integer empno;
	//��ģ��
	private Emp emp;
	
	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	//����EmpBo
	private IEmpBo empBo;
	public IEmpBo getEmpBo() {
		return empBo;
	}

	public void setEmpBo(IEmpBo empBo) {
		this.empBo = empBo;
	}
	//Action��ҵ�񷽷���Ҫ��get��ͷ.
	//��ȡ����Ա��
	public String findEmps() {
		System.out.println("bo obj : " + empBo);
		System.out.println(this+" action getEmps .... ");
		List<Emp> emps = empBo.getEmps();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("emps", emps);		
		return "success";
	}
	
	//ɾ��ָ��Ա��
	public String deleteEmp() {
		System.out.println(this+" action deleteEmp .... ");
		System.out.println("bo obj : " + empBo);
		int rowCount = empBo.deleteEmp(empno);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("mess", "ɾ���ɹ�");
		
		return "input";
	}
		
}
