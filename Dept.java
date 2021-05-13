package java_threading_demos.src.com.scp.java.demo.college;

import java.util.Arrays;

public class Dept {
	private int deptId;
	private String deptName;
	private Student[] student;
	private Professors[] professor;
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + ", student=" + Arrays.toString(student)
				+ ", professor=" + Arrays.toString(professor) + "]";
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	public Professors[] getProfessor() {
		return professor;
	}
	public void setProfessor(Professors[] professor) {
		this.professor = professor;
	}
	public Dept(int deptId, String deptName, Student[] student, Professors[] professor) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.student = student;
		this.professor = professor;
	}
	

}
