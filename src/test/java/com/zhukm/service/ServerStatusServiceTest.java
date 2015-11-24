package com.zhukm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.zhukm.Application;
import com.zhukm.entity.ServerStatus;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@Transactional
public class ServerStatusServiceTest {

	@Autowired
	private ServerStatusService serverStatusService;
	
	@Test
	public void testInsertStatus(){
		ServerStatus status = new ServerStatus();
		status.setDisk("disk");
		status.setMemory_free(70);
		status.setServer_ip("192.168.0.1");
		status.setCpu_use(40);
		serverStatusService.insertServerStatus(status);
	}

	@Test 
	public void testFindAll(){
		ServerStatus status = new ServerStatus();
		status.setDisk("disk");
		status.setMemory_free(70);
		status.setServer_ip("192.168.0.1");
		status.setCpu_use(40);
		serverStatusService.insertServerStatus(status);
		
		List<ServerStatus> statusList = serverStatusService.findAll();
		
		for(ServerStatus s : statusList){
			System.out.println(s);
		}
		
		Assert.assertEquals(1, statusList.size());
	}
}
