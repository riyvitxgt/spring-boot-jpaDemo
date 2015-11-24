package com.zhukm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhukm.entity.ServerStatus;
import com.zhukm.repository.ServerStatusRepository;

@Service
public class ServerStatusService {
	@Autowired
	private ServerStatusRepository serverStatusRepository;
	
	public void insertServerStatus(ServerStatus serverStatus){
		serverStatusRepository.saveAndFlush(serverStatus);
	}
	
	public List<ServerStatus> findAll(){
		return serverStatusRepository.findAll();
	}
}
