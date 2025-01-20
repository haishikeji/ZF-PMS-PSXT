package com.px.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.px.common.utils.Query;
import com.px.system.dao.SearchMattersDao;
import com.px.system.domain.SearchMattersDO;
import com.px.system.service.SearchMattersService;



@Service
public class SearchMattersServiceImpl implements SearchMattersService {
	@Autowired
	private SearchMattersDao searchMattersDao;
	
	@Override
	public SearchMattersDO get(String id){
		return searchMattersDao.get(id);
	}
	
	@Override
	public List<SearchMattersDO> list(Map<String, Object> map){
		return searchMattersDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return searchMattersDao.count(map);
	}
	
	@Override
	public int save(SearchMattersDO searchMatters){
		return searchMattersDao.save(searchMatters);
	}
	
	@Override
	public int update(SearchMattersDO searchMatters){
		return searchMattersDao.update(searchMatters);
	}
	
	@Override
	public int remove(String id){
		return searchMattersDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return searchMattersDao.batchRemove(ids);
	}

	@Override
	public int getNumber(String bizMatterId) {
		return searchMattersDao.getNumber(bizMatterId);
	}

	@Override
	public List<SearchMattersDO> listForHot() {
		return searchMattersDao.listForHot();
	}

	@Override
	public List<SearchMattersDO> listRanking() {
		return searchMattersDao.listRanking();
	}

	@Override
	public List<SearchMattersDO> listForHot1() {
		return searchMattersDao.listForHot1();
	}

	@Override
	public int searchAdd(String id) {
		return searchMattersDao.searchAdd(id);
	}

	@Override
	public int getCount() {
		return searchMattersDao.getCount();
	}

	@Override
	public List<SearchMattersDO> list2(Query query) {
		return searchMattersDao.list2(query);
	}

	@Override
	public void update2(SearchMattersDO searchMatters) {
		searchMattersDao.update2(searchMatters);		
	}

	@Override
	public int remove2(String id) {
		return searchMattersDao.remove2(id);
	}

	@Override
	public int count2(Query query) {
		return searchMattersDao.count2(query);
	}

	@Override
	public int save2(SearchMattersDO searchMatters) {
		return searchMattersDao.save2(searchMatters);
	}

	@Override
	public int count3() {
		return searchMattersDao.count3();
	}

	@Override
	public int getNumber2(String bizMatterId) {
		return searchMattersDao.getNumber2(bizMatterId);
	}

}
