package com.fzw.dtp.model;

public interface NameNode extends Node {
	/**
	 * 得到所有DataNode信息
	 * @return
	 */
	public DataNode[] getAllDataNodes();
}
