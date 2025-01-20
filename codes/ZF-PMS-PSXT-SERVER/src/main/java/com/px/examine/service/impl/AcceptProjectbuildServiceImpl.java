package com.px.examine.service.impl;

import com.px.examine.dao.AcceptProjectDao;
import com.px.examine.service.AcceptProjectService;
import com.px.projectbuild.domain.ProjectbuildDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
public class AcceptProjectbuildServiceImpl implements AcceptProjectService {
	@Autowired
	private AcceptProjectDao acceptProjectDao;
	
	@Override
	public ProjectbuildDO get(Integer id){
		return acceptProjectDao.get(id);
	}
	
	@Override
	public List<ProjectbuildDO> list(Map<String, Object> map){
		return acceptProjectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return acceptProjectDao.count(map);
	}
	
	@Override
	public int save(ProjectbuildDO project){

		//获取当前时间，作为年度计划创建时间
		Date creatTime=new Date();
		//设置日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		project.setCreatTime(sdf.format(creatTime));
		return acceptProjectDao.save(project);
	}
	
	@Override
	public int update(ProjectbuildDO project){
		//获取当前修改时间，作为年度计划最后修改时间
		Date updateTime = new Date();
		//设置日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		project.setUpdateTime(sdf.format(updateTime));
		return acceptProjectDao.update(project);
	}
	
	@Override
	public int remove(Integer id){
		return acceptProjectDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return acceptProjectDao.batchRemove(ids);
	}

	@Override
	public List<ProjectbuildDO> uplist(Map<String, Object> map) {
		return acceptProjectDao.uplist(map);
	}

	@Override
	public int upcount(Map<String, Object> map) {
		return acceptProjectDao.upcount(map);
	}

	@Override
	public List<ProjectbuildDO> maintlist(Map<String, Object> map) {
		return acceptProjectDao.maintlist(map);
	}

	@Override
	public int maintcount(Map<String, Object> map) {
		return acceptProjectDao.maintcount(map);
	}

}
