package set.employee;

public class Employee {
	int empId;      //사번
	String empName; //이름
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + ", " + empName;
	}

	//1.객체 동일 여부 재정의 - equals()
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee employee = (Employee)obj;
			if(this.empId == employee.empId)
				return true;
		}
		return false;
	}

	//2. 객체 동일 여부 - hashCode() 재정의
	@Override
	public int hashCode() {
		return empId;
	}
}





