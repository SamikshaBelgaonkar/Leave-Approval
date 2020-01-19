package com.leaveapproval.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leaveapproval.app.model.LeaveEntity;
import com.leaveapproval.app.service.LeaveApprovalService;

@RestController
public class LeaveApprovalController {

	@Autowired
	private LeaveApprovalService leaveApprovalService;
	
	@GetMapping("api/leaveStatus")
	public List<LeaveEntity> getAllRecords(){
		return leaveApprovalService.getAllEmpRecords();
		
		
		
	}
}
