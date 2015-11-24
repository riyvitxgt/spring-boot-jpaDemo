package com.zhukm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "server_status")
public class ServerStatus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private  Long id;
	
	/**服务器IP*/
	@Column(nullable = false)
	private String server_ip;
	
	/**可用内存*/
	@Column(nullable = false)
	private int memory_free;
	
	/**CPU使用率*/
	@Column
	private int cpu_use;
	
	@Column
	private String disk;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServer_ip() {
		return server_ip;
	}

	public void setServer_ip(String server_ip) {
		this.server_ip = server_ip;
	}

	public int getMemory_free() {
		return memory_free;
	}

	public void setMemory_free(int memory_free) {
		this.memory_free = memory_free;
	}

	public int getCpu_use() {
		return cpu_use;
	}

	public void setCpu_use(int cpu_use) {
		this.cpu_use = cpu_use;
	}

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}

	@Override
	public String toString() {
		return this.server_ip;
	}
	
	
}
