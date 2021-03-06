package com.xh.mybatis.plus.shiro.commons.result;

import java.io.Serializable;

/**
 * <p>Title: 操作结果集</p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @date 2018年3月6日
 *
 */
public class Result implements Serializable {

	public static final int SUCCESS = 1;
	public static final int FAILURE = -1;

	private static final long serialVersionUID = 5576237395711742681L;

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
