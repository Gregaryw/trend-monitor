package com.trend.schedule.web;

import com.trend.base.BaseController;
import com.trend.base.BaseService;
import com.trend.schedule.entity.ScheduleJob;
import com.trend.schedule.service.ScheduleJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/11/11
 */
@Controller
@RequestMapping("/schedule")
public class ScheduleJobController extends BaseController<ScheduleJob> {
    @Autowired
    private ScheduleJobService scheduleJobService;

    @Override
    protected BaseService<ScheduleJob> getBaseService() {
        return scheduleJobService;
    }

}
