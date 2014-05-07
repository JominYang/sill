package me.jomin.sill.framework.common.model.support;

import java.util.ArrayList;
import java.util.List;

import me.jomin.sill.framework.common.model.AbstractModel;

public class DataGrid extends AbstractModel{

	private static final long serialVersionUID = 1L;
	private Long total = 0L;
	private List<Object> rows = new ArrayList<Object>();

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Object> getRows() {
		return rows;
	}

	public void setRows(List<Object> rows) {
		this.rows = rows;
	}

}
