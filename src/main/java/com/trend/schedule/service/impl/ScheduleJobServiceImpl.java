package com.trend.schedule.service.impl;

import com.trend.base.BaseServiceImpl;
import com.trend.schedule.entity.ScheduleJob;
import com.trend.schedule.mapper.ScheduleJobMapper;
import com.trend.schedule.service.ScheduleJobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ScheduleJob的服务接口的实现类
 * 
 * @author 
 *
 */
@Service("scheduleJobService")
@Slf4j
public class ScheduleJobServiceImpl extends BaseServiceImpl<ScheduleJob> implements ScheduleJobService {
	@Autowired
	private ScheduleJobMapper scheduleJobMapper;

}