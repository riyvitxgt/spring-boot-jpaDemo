package com.zhukm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zhukm.entity.ServerStatus;

public interface ServerStatusRepository extends JpaRepository<ServerStatus, Long>{

	@Query("SELECT s FROM ServerStatus s")
	List<ServerStatus> findAllPage();
	
}
