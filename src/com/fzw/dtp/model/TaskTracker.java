package com.fzw.dtp.model;

/**
 * 计算器，实际的处理能力
 * 1.反馈处理器信息给JobTracker
 * 2.储存处理结果到DataNode
 * @author hwj
 *
 */
public interface TaskTracker extends Tracker {
	/**
	 * 计算,处理任务
	 */
	public Result compute();
	
	/**
	 * 找到此任务对应的DataNode，用于存放数据，算法自定，使用和Task绑定或和TaskTracker绑定
	 * @param task
	 * @return
	 */
	public DataNode findDataNode();
	
	/**
	 * 储存处理结果
	 */
	public void storeResult();
}
