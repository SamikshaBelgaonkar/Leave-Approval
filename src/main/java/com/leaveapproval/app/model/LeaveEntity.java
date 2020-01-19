package com.leaveapproval.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "LEAVE_APPROVAL")
public class LeaveEntity {

	@Id
	@GeneratedValue
	private long leave_id;
	private String user_id;
	private String user_name;
	private String emp_role;
	private String leave_status;
	private String start_date;
	private String end_date;
	
	public LeaveEntity() {
		super();
	}
	public LeaveEntity(String user_id, String user_name, String emp_role, String leave_status, String start_date,
			String end_date) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.emp_role = emp_role;
		this.leave_status = leave_status;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	public long getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(long leave_id) {
		this.leave_id = leave_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmp_role() {
		return emp_role;
	}
	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}
	public String getLeave_status() {
		return leave_status;
	}
	public void setLeave_status(String leave_status) {
		this.leave_status = leave_status;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
	

}
