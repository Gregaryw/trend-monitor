drop table if exists `schedule_job`;
CREATE TABLE `schedule_job` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(30) NOT NULL DEFAULT '' COMMENT '任务组',
  `name` varchar(30) NOT NULL DEFAULT '' COMMENT '任务名称',
  `description` varchar(100) NOT NULL DEFAULT '' COMMENT '任务描述',
  `cron` varchar(30) NOT NULL DEFAULT '' COMMENT 'cron表达式',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `exe_count` int(11) NOT NULL DEFAULT '0' COMMENT '执行次数',
  `max_exe_count` int(11) NOT NULL DEFAULT '-1' COMMENT '最大执行次数',
  `job_status` varchar(30) NOT NULL DEFAULT '' COMMENT '任务状态',
  `class_name` varchar(255) NOT NULL DEFAULT '' COMMENT '类全路径名',
  `method_name` varchar(30) NOT NULL DEFAULT '' COMMENT '方法名',
  `spring_bean` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否为spring bean',
  `delay_time` int(11) NOT NULL DEFAULT '0' COMMENT '延迟秒数',
  `interval_time` int(11) NOT NULL DEFAULT '0' COMMENT '间隔秒数',
  `running` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否正在运行',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
)