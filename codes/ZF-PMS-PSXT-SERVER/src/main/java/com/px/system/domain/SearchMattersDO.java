package com.px.system.domain;

import java.io.Serializable;


/**
 * 热搜表
 * 
 * @author 品讯科技
 * @email zly@hnpinxun.cn
 * @date 2024-08
 */
public class SearchMattersDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String id;
	//事项id
	private String bizMatterId;
	//事项名称
	private String bizMatterName;
	//次数
	private Integer number;
	//手动控制展示的位置
	private Integer orderNum;
	//状态 1启用  0禁用
	private String flag;
	//排行次序
	private Integer ranking;

	
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：事项id
	 */
	public void setBizMatterId(String bizMatterId) {
		this.bizMatterId = bizMatterId;
	}
	/**
	 * 获取：事项id
	 */
	public String getBizMatterId() {
		return bizMatterId;
	}
	/**
	 * 设置：事项名称
	 */
	public void setBizMatterName(String bizMatterName) {
		this.bizMatterName = bizMatterName;
	}
	/**
	 * 获取：事项名称
	 */
	public String getBizMatterName() {
		return bizMatterName;
	}
	/**
	 * 设置：次数
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	/**
	 * 获取：次数
	 */
	public Integer getNumber() {
		return number;
	}
	/**
	 * 设置：手动控制展示的位置
	 */
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * 获取：手动控制展示的位置
	 */
	public Integer getOrderNum() {
		return orderNum;
	}
	/**
	 * 设置：状态 0启用  1禁用
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}
	/**
	 * 获取：状态 0启用  1禁用
	 */
	public String getFlag() {
		return flag;
	}
}
