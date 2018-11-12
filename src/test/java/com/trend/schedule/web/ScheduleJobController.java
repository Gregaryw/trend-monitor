package com.sephome.schedule.web;

import com.sephome.base.BaseController;
import com.sephome.base.BaseService;
import com.sephome.schedule.entity.ScheduleJob;
import com.sephome.schedule.service.ScheduleJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
