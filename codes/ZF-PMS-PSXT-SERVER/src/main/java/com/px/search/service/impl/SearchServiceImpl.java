package com.px.search.service.impl;

import com.px.declare.domain.ProjectDO;
import com.px.search.dao.SearchDao;
import com.px.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	private SearchDao searchDao;
	
	@Override
	public ProjectDO get(Integer id){
		return searchDao.get(id);
	}

	@Override
	public ProjectDO totleAmount(Map<String, Object> map) {

		return searchDao.totleAmount(map);
	}

	@Override
	public List<ProjectDO> list(Map<String, Object> map){
		return searchDao.list(map);
	}


	@Override
	public int count(Map<String, Object> map){
		return searchDao.count(map);
	}


}
