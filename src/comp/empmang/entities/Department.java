package comp.empmang.entities;

public class Department {
	private String deptid;
	private String deptname;

	public Department(String deptid, String deptname) {
		this.deptid = deptid;
		this.deptname = deptname;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

}
