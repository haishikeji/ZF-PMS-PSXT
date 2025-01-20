package com.px.examine.controller;

import com.px.common.domain.FileDO;
import com.px.common.service.FileService;
import com.px.common.utils.PageUtils;
import com.px.common.utils.Query;
import com.px.common.utils.R;
import com.px.common.utils.StringUtils;
import com.px.examine.service.SelfRecordService;
import com.px.projectbuild.domain.RecordDO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 项目验收
 * 备案
 *
 * @author 品讯科技
 * @email zly@hnpinxun.cn
 * @date 2024-08
 */
 
@Controller
@RequestMapping("/selfProject/record")
public class SelfRecordController {
	@Autowired
	private SelfRecordService recordSelfService;
	
	@GetMapping("/{id}")
	@RequiresPermissions("selfProject:record:record")
	String Record(@PathVariable("id") Integer id,Model model){
		model.addAttribute("projectId", id);
	    return "examine/selfRecord/record";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("selfProject:record:record")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<RecordDO> recordList = recordSelfService.list(query);
		int total = recordSelfService.count(query);
		PageUtils pageUtils = new PageUtils(recordList, total);
		return pageUtils;
	}
	
	@GetMapping("/add/{projectId}")
	@RequiresPermissions("selfProject:record:add")
	String add(@PathVariable("projectId") String projectId,Model model){
		model.addAttribute("projectId", projectId);
	    return "examine/selfRecord/add";
	}

	@Autowired
	private FileService sysFileService;

	@GetMapping("/edit/{id}")
	@RequiresPermissions("selfProject:record:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		RecordDO record = recordSelfService.get(id);
		model.addAttribute("record", record);

		List<FileDO> signList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		if (StringUtils.isNotBlank(record.getEnclosureId())) {
			map.put("ids", record.getEnclosureId().replaceAll("\\[", "").replaceAll("]", "").replaceAll("\"", ""));
			signList = sysFileService.getList(map);
		}
		model.addAttribute("signList", signList);
	    return "examine/selfRecord/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("selfProject:record:add")
	public R save(RecordDO record){
		if(recordSelfService.save(record)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("selfProject:record:edit")
	public R update( RecordDO record){
		recordSelfService.update(record);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("selfProject:record:remove")
	public R remove( Integer recordId){
		if(recordSelfService.remove(recordId)>0){
		return R.ok();
		}
		return R.error();
	}
	

	
}
