package com.icss.vo;

import java.util.List;

/**
 * 
 * @author Administrator
 *
 * @param <E>
 */
public class PageVO<E> {
	/**
	 * 总计数量
	 */
	private long total;
	/**
	 * 当前页的数据
	 */
	private List<E> rows;
	
	
	public PageVO() {
		super();
	}
	public PageVO(long total, List<E> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<E> getRows() {
		return rows;
	}
	public void setRows(List<E> rows) {
		this.rows = rows;
	}


}
