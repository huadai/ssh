package action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import model.Emp;
import bo.IEmpBo;

public class EmpAction {
	
	//参数
	private Integer empno;
	//域模型
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

	//依赖EmpBo
	private IEmpBo empBo;
	public IEmpBo getEmpBo() {
		return empBo;
	}

	public void setEmpBo(IEmpBo empBo) {
		this.empBo = empBo;
	}
	//Action的业务方法不要以get开头.
	//获取所有员工
	public String findEmps() {
		System.out.println("bo obj : " + empBo);
		System.out.println(this+" action getEmps .... ");
		List<Emp> emps = empBo.getEmps();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("emps", emps);		
		return "success";
	}
	
	//删除指定员工
	public String deleteEmp() {
		System.out.println(this+" action deleteEmp .... ");
		System.out.println("bo obj : " + empBo);
		int rowCount = empBo.deleteEmp(empno);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("mess", "删除成功");
		
		return "input";
	}
		
}
