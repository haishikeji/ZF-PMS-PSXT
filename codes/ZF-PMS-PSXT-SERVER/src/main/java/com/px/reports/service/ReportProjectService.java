package com.px.reports.service;

import com.px.reports.domain.ReportProjectDO;
import com.px.reports.domain.reportByDept;

import java.util.List;
import java.util.Map;

/**
 * 项目申报年度计划表
 * 
 * @author 品讯科技
 * @email zly@hnpinxun.cn
 * @date 2024-08
 */
public interface ReportProjectService {
	ReportProjectDO get(Integer id);

	List<ReportProjectDO> list(Map<String, Object> map);

	ReportProjectDO totleAmount(Map<String, Object> map);


	int count(Map<String, Object> map);

	List<String> deptName();

    List<reportByDept> reportMainList(Map<String, Object> map);

	int reportMainListCount(Map<String, Object> map);
}
