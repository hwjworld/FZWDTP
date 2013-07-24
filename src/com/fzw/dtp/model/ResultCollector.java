package com.fzw.dtp.model;

/**
 * 结果收集器,具有以下职责
 * 1.从公共配置中收集DataNode信息并收集结果
 * 2.显示收集状态，已收集多少，还剩多少
 * 
 * @author hwj
 *
 */
public interface ResultCollector {
	public void collect();
}
