package com.px.examine.dao;



import java.util.List;
import java.util.Map;

import com.px.examine.domain.ExamineDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 项目申报年度计划表
 * @author 品讯科技
 * @email zly@hnpinxun.cn
 * @date 2024-08
 */
@Mapper
public interface ExamineDao {

	ExamineDO get(Integer id);
	
	List<ExamineDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);

	List<ExamineDO> finishList(Map<String, Object> map);

	int finishCount(Map<String, Object> map);

	int update(ExamineDO examine);
	

}
