package HasAEarlyMethodRelationship;

public class HasAMethodMultipleObjects2 {

	static class Department {
		private String deptName;

		public String getDeptName() {
			return deptName;
		}

		public Department(String deptName) {
			this.deptName = deptName;
		}

	}

	static class University {
		private String uniName;
		private Department[] departments;

		public String getUniName() {
			return uniName;
		}

		public void setUniName(String uniName) {
			this.uniName = uniName;
		}


		public Department[] getDepartments() {
			return departments;
		}

		public void setDepartments(Department[] departments) {
			this.departments = departments;
		}

		public static void main(String[] args) {
			
			University lpu=new University();
			// By setter method
			Department[] departments= {new Department("CSE"),new Department("ECE"),new Department("EEE"),new Department("IT")};
			lpu.setUniName("LPU");
			lpu.setDepartments(departments);
			System.out.println(lpu.getUniName()   );
			for(int i=0;i<lpu.getDepartments().length;i++) {
				System.out.println(lpu.getDepartments()[i].getDeptName());
			}
		}

	}

}
