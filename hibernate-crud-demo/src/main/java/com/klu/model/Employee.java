package com.klu.model;
import javax.persistence.*;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empid;
    private String empname;
    private double empsalary;
    @ManyToOne
    @JoinColumn(name="deptid")
    private Department department;
    
    private void setEmpId(int empid)
    {
    	this.empid=empid;
    }
    public int getempId() {
    	return empid;
    }
    public void setDeptName(String empname)
    {
    	this.empname=empname;
    }


}
