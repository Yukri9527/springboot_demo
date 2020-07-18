package com.edu.domain;

public class DeptInfo {

	// ����˽�л���װ
	private Integer deptno;

	private String dname;

	private String loc;
	// ����->���� get���� set����

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) { // ����ȥ���˽�б���
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public DeptInfo(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	@Override // ���Ǹ���object
	public String toString() {
		return "DeptInfo [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	public DeptInfo() {
		// �޲ι��캯��
	}
}
