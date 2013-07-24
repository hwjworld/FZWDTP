package com.fzw.dtp.model;

/**
 * 任务调试器，具有以下职责
 * 1.分配任务到可用的TaskTacker
 * 2.显示所有TaskTacker的状态
 * 3.管理TaskTacker，包括启用，停用
 * 4.自身保护机制，单点，防宕
 * @author hwj
 *
 */
public interface JobTracker extends Tracker {
	
	/**
	 * 分配任务
	 * @param taskTracker
	 */
	public void dispatch(Task task);
	
	/**
	 *　找到可用的任务处理器 
	 * @return
	 */
	TaskTracker findFreeTaskTracker();
	
	/**
	 * 得到所有TaskTracker
	 * @return
	 */
	public TaskTracker[] getAllTaskTrackers();
	
	/**
	 * 启用TaskTracker，
	 * 1.JobTracker开始分配任务于它
	 * 2.打开TaskTracker的相应资源
	 * @param taskTracker
	 */
	public void enableTaskTracker(TaskTracker taskTracker);
	
	/**
	 * 停用TaskTracker，
	 * 1.JobTracker停止分配任务于它
	 * 2.关闭TaskTracker的相应资源
	 * @param taskTracker
	 */
	public void disableTaskTracker(TaskTracker taskTracker);
	
}
