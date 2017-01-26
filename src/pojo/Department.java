package pojo;

public class Department {

	private int departId;
	private String departmentName;

	public Department(int departId, String departmentName) {
		super();
		this.departId = departId;
		this.departmentName = departmentName;
	}

	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departId=" + departId + ", departmentName=" + departmentName + "]";
	}
	
}
