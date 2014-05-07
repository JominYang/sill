package me.jomin.sill.framework.common.model.support;

import java.util.List;

import me.jomin.sill.framework.common.model.AbstractModel;

public class SessionInfo extends AbstractModel {

	private static final long serialVersionUID = 1L;
	private String id;// 用户ID
	private String name;// 用户登录名
	private String ip;// 用户IP

	private List<String> resourceList;// 用户可以访问的资源地址列表

	public List<String> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<String> resourceList) {
		this.resourceList = resourceList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

