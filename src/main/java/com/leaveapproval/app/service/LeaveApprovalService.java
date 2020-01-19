package com.leaveapproval.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaveapproval.app.model.LeaveEntity;
import com.leaveapproval.app.repository.LaRepository;

@Service
public class LeaveApprovalService {

	@Autowired
	private LaRepository laRepository;
	
	public List<LeaveEntity> getAllEmpRecords()
	{
		//return laRepository.findAll();
		List<LeaveEntity> tempList = new ArrayList<>();
		tempList = laRepository.findAll();
		if(tempList!=null) {
//			for(LeaveEntity e : tempList )
//			{
//				e.equals("")
//			}
		}
		return null;
	}
}
