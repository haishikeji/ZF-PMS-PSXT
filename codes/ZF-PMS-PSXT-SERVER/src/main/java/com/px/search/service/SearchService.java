package com.px.search.service;

import com.px.declare.domain.ProjectDO;

import java.util.List;
import java.util.Map;

/**
 * 项目申报年度计划表
 * 
 * @author 品讯科技
 * @email zly@hnpinxun.cn
 * @date 2024-08
 */
public interface SearchService {

	ProjectDO get(Integer id);




	List<ProjectDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);


	ProjectDO totleAmount(Map<String, Object> map);
}
