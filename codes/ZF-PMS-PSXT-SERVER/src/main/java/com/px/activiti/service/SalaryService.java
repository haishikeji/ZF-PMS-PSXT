package com.px.activiti.service;

import com.px.activiti.domain.SalaryDO;

import java.util.List;
import java.util.Map;

/**
 * 审批流程测试表
 * 
 * @author 品讯科技
 * @email zly@hnpinxun.cn
 * @date 2024-08
 */
public interface SalaryService {
	
	SalaryDO get(String id);
	
	List<SalaryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SalaryDO salary);
	
	int update(SalaryDO salary);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
