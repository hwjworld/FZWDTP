package com.fzw.dtp.model;

/**
 * 任务类
 * 1.包括任务信息
 * 2.包括任务处理结果
 * 3.处理此任务的TaskTracker
 * 4.保存结果的DataNode
 * @author hwj
 *
 */
public interface Task {
	public TrackerInfo getTaskTrackerInfo();
}
