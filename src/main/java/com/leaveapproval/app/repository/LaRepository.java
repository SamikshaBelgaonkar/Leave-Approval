package com.leaveapproval.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaveapproval.app.model.LeaveEntity;

@Repository
public interface LaRepository  extends JpaRepository<LeaveEntity,Long> {

}
