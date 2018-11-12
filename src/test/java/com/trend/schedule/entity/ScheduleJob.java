package com.sephome.schedule.entity;

import com.sephome.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * schedule_job实体类
 * 
 * @author 
 *
 */
@Entity
public class ScheduleJob extends BaseEntity {
	@Id
	private Integer id; 
	/**任务组*/
	private String groupName;
	/**任务名称*/
	private String name; 
	/**任务描述*/
	private String description;
	/**cron表达式*/
	private String cron;
	/**开始时间*/
	private Date startTime;
	/**结束时间*/
	private Date endTime;
	/**执行次数*/
	private Integer exeCount;
	/**最大执行次数*/
	private Integer maxExeCount;
	/**任务状态*/
	private String jobStatus;
	/**类全路径名*/
	private String className;
	/**方法名*/
	private String methodName;
	/**是否为spring bean*/
	private Integer springBean;
	/**延迟秒数*/
	private Integer delayTime;
	/**间隔秒数*/
	private Integer intervalTime;
	/**是否正在运行*/
	private Integer running;
	/***/
	private Date createTime;
	/***/
	private Date updateTime;
	/***/
	private Integer status;



}
