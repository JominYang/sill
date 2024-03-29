package me.jomin.sill.framework.common.model.support;

import me.jomin.sill.framework.common.model.AbstractModel;

public class JsonMessage extends AbstractModel {

	private static final long serialVersionUID = 1L;
	private boolean success = false;

	private String msg = "";

	private Object obj = null;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
