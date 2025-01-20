package com.px.approval.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 项目申报年度计划表
 *
 * @author 品讯科技
 * @email zly@hnpinxun.cn
 * @date 2024-08
 */
public class ApprovalDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//id
	private Integer id;
	//项目编号(项目升级、项目维护时先获取历史项目编号)
	private String projectHisid;
	//项目编号
	private String projectId;
	//项目名称
	private String projectName;
	//项目类型-1.新项目 2.项目升级 3.项目维护 9.期初项目
	private String projectType;
	//建设内容
	private String content;
	//总投资(万元)
	private BigDecimal totalInvestment;
	//区财政投资(万元)
	private BigDecimal districtInvestment;
	//年度投资(万元)
	private BigDecimal annualInvestment;
	//实施周期(月)
	private Integer cycle;
	//项目成效
	private String results;
	//备注说明
	private String remark;
	//填报时间
	private String date;
	//填报人
	private String name;
	//联系电话
	private String phone;
	//分管负责人
	private String secondary;
	//主要负责人
	private String chargePerson;
	//附件管理-建议书
	private String enclosureProposalid;
	//附件管理-可行性
	private String enclosureFeasibilityid;
	//附件管理-智慧办
	private String enclosureSmartid;
	//附件管理-领导小组
	private String enclosureLeaderid;
	//创建人
	private String creatUserId;
	//创建时间
	private String creatTime;
	//状态见数据字典表-类型（SHZT）项目申报可见状态11，12，13；初步方案可见状态：3，14，15，16
	private Integer status;
	//状态名称
	private String ditname;
	//最近修改人id
	private String updateUserId;
	//修改时间
	private String updateTime;
	//区智慧办的审核意见-年度计划
	private String pinionOqzhb;
	//领导小组的审核意见-年度计划
	private String pinionOldxz;
	//区智慧办审核意见-初步方案
	private String pinionTqzhb;
	//区财政局的审核意见-初步方案
	private String pinionTqczj;
	//行政审批局的审核意见-初步方案
	private String pinionTxzspj;
	//区智慧办审核人-年度计划
	private String pinionOqzhbAuditop;
	//区智慧办审核时间-年度计划
	private Date pinionOqzhbDate;
	//领导小组审核人-年度计划
	private String pinionOldxzAuditop;
	//领导小组审核时间-年度计划
	private Date pinionOldxzDate;
	//区智慧办审核人-初步方案
	private String pinionTqzhbAuditop;
	//区智慧办审核时间-初步方案
	private Date pinionTqzhbDate;
	//区财政局的审核人-初步方案
	private String pinionTqczjAuditop;
	//区财政局的审核时间-初步方案
	private Date pinionTqczjDate;
	//行政审批局的审核人-初步方案
	private String pinionTxzspjAuditop;
	//行政审批局的审核时间-初步方案
	private Date pinionTxzspjDate;
	//得到部门的相关信息
	private String projectDept;
	//附件管理-区智慧办审核意见-初步方案
	private String pinionTqzhbId;
	//附件管理-区财政局的审核意见-初步方案
	private String pinionTqczjId;
	//附件管理-行政审批局的审核意见-初步方案
	private String pinionTxzspjId;
	private Date checkTime;
	//得到部门的相关信息名称
	private String projectDeptName;

	public String getProjectDeptName() {
		return projectDeptName;
	}

	public void setProjectDeptName(String projectDeptName) {
		this.projectDeptName = projectDeptName;
	}
	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getPinionTqzhbId() {
		return pinionTqzhbId;
	}

	public void setPinionTqzhbId(String pinionTqzhbId) {
		this.pinionTqzhbId = pinionTqzhbId;
	}

	public String getPinionTqczjId() {
		return pinionTqczjId;
	}

	public void setPinionTqczjId(String pinionTqczjId) {
		this.pinionTqczjId = pinionTqczjId;
	}

	public String getPinionTxzspjId() {
		return pinionTxzspjId;
	}

	public void setPinionTxzspjId(String pinionTxzspjId) {
		this.pinionTxzspjId = pinionTxzspjId;
	}

	/**
	 * 设置：id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：项目编号(项目升级、项目维护时先获取历史项目编号)
	 */
	public void setProjectHisid(String projectHisid) {
		this.projectHisid = projectHisid;
	}
	/**
	 * 获取：项目编号(项目升级、项目维护时先获取历史项目编号)
	 */
	public String getProjectHisid() {
		return projectHisid;
	}
	/**
	 * 设置：项目编号
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * 获取：项目编号
	 */
	public String getProjectId() {
		return projectId;
	}
	/**
	 * 设置：项目名称
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * 获取：项目名称
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * 设置：项目类型-1.新项目 2.项目升级 3.项目维护 9.期初项目
	 */
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	/**
	 * 获取：项目类型-1.新项目 2.项目升级 3.项目维护 9.期初项目
	 */
	public String getProjectType() {
		return projectType;
	}
	/**
	 * 设置：建设内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：建设内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：总投资(万元)
	 */
	public void setTotalInvestment(BigDecimal totalInvestment) {
		this.totalInvestment = totalInvestment;
	}
	/**
	 * 获取：总投资(万元)
	 */
	public BigDecimal getTotalInvestment() {
		return totalInvestment;
	}
	/**
	 * 设置：区财政投资(万元)
	 */
	public void setDistrictInvestment(BigDecimal districtInvestment) {
		this.districtInvestment = districtInvestment;
	}
	/**
	 * 获取：区财政投资(万元)
	 */
	public BigDecimal getDistrictInvestment() {
		return districtInvestment;
	}
	/**
	 * 设置：年度投资(万元)
	 */
	public void setAnnualInvestment(BigDecimal annualInvestment) {
		this.annualInvestment = annualInvestment;
	}
	/**
	 * 获取：年度投资(万元)
	 */
	public BigDecimal getAnnualInvestment() {
		return annualInvestment;
	}
	public String getDitname() {
		return ditname;
	}

	public void setDitname(String ditname) {
		this.ditname = ditname;
	}

	/**
	 * 设置：实施周期(月)
	 */
	public void setCycle(Integer cycle) {
		this.cycle = cycle;
	}
	/**
	 * 获取：实施周期(月)
	 */
	public Integer getCycle() {
		return cycle;
	}
	/**
	 * 设置：项目成效
	 */
	public void setResults(String results) {
		this.results = results;
	}
	/**
	 * 获取：项目成效
	 */
	public String getResults() {
		return results;
	}
	/**
	 * 设置：备注说明
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注说明
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：填报时间
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * 获取：填报时间
	 */
	public String getDate() {
		return date;
	}
	/**
	 * 设置：填报人
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：填报人
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：分管负责人
	 */
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
	/**
	 * 获取：分管负责人
	 */
	public String getSecondary() {
		return secondary;
	}
	/**
	 * 设置：主要负责人
	 */
	public void setChargePerson(String chargePerson) {
		this.chargePerson = chargePerson;
	}
	/**
	 * 获取：主要负责人
	 */
	public String getChargePerson() {
		return chargePerson;
	}
	/**
	 * 设置：附件管理-建议书
	 */
	public void setEnclosureProposalid(String enclosureProposalid) {
		this.enclosureProposalid = enclosureProposalid;
	}
	/**
	 * 获取：附件管理-建议书
	 */
	public String getEnclosureProposalid() {
		return enclosureProposalid;
	}
	/**
	 * 设置：附件管理-可行性
	 */
	public void setEnclosureFeasibilityid(String enclosureFeasibilityid) {
		this.enclosureFeasibilityid = enclosureFeasibilityid;
	}
	/**
	 * 获取：附件管理-可行性
	 */
	public String getEnclosureFeasibilityid() {
		return enclosureFeasibilityid;
	}


	public String getEnclosureSmartid() {
		return enclosureSmartid;
	}

	public void setEnclosureSmartid(String enclosureSmartid) {
		this.enclosureSmartid = enclosureSmartid;
	}

	public String getEnclosureLeaderid() {
		return enclosureLeaderid;
	}

	public void setEnclosureLeaderid(String enclosureLeaderid) {
		this.enclosureLeaderid = enclosureLeaderid;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreatUserId(String creatUserId) {
		this.creatUserId = creatUserId;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreatUserId() {
		return creatUserId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	/**
	 * 获取：创建时间
	 */
	public String getCreatTime() {
		return creatTime;
	}
	/**
	 * 设置：状态见数据字典表-类型（SHZT）项目申报可见状态11，12，13；初步方案可见状态：3，14，15，16
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态见数据字典表-类型（SHZT）项目申报可见状态11，12，13；初步方案可见状态：3，14，15，16
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：最近修改人id
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	/**
	 * 获取：最近修改人id
	 */
	public String getUpdateUserId() {
		return updateUserId;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：区智慧办的审核意见-年度计划
	 */
	public void setPinionOqzhb(String pinionOqzhb) {
		this.pinionOqzhb = pinionOqzhb;
	}
	/**
	 * 获取：区智慧办的审核意见-年度计划
	 */
	public String getPinionOqzhb() {
		return pinionOqzhb;
	}
	/**
	 * 设置：领导小组的审核意见-年度计划
	 */
	public void setPinionOldxz(String pinionOldxz) {
		this.pinionOldxz = pinionOldxz;
	}
	/**
	 * 获取：领导小组的审核意见-年度计划
	 */
	public String getPinionOldxz() {
		return pinionOldxz;
	}
	/**
	 * 设置：区智慧办审核意见-初步方案
	 */
	public void setPinionTqzhb(String pinionTqzhb) {
		this.pinionTqzhb = pinionTqzhb;
	}
	/**
	 * 获取：区智慧办审核意见-初步方案
	 */
	public String getPinionTqzhb() {
		return pinionTqzhb;
	}
	/**
	 * 设置：区财政局的审核意见-初步方案
	 */
	public void setPinionTqczj(String pinionTqczj) {
		this.pinionTqczj = pinionTqczj;
	}
	/**
	 * 获取：区财政局的审核意见-初步方案
	 */
	public String getPinionTqczj() {
		return pinionTqczj;
	}
	/**
	 * 设置：行政审批局的审核意见-初步方案
	 */
	public void setPinionTxzspj(String pinionTxzspj) {
		this.pinionTxzspj = pinionTxzspj;
	}
	/**
	 * 获取：行政审批局的审核意见-初步方案
	 */
	public String getPinionTxzspj() {
		return pinionTxzspj;
	}
	/**
	 * 设置：区智慧办审核人-年度计划
	 */
	public void setPinionOqzhbAuditop(String pinionOqzhbAuditop) {
		this.pinionOqzhbAuditop = pinionOqzhbAuditop;
	}
	/**
	 * 获取：区智慧办审核人-年度计划
	 */
	public String getPinionOqzhbAuditop() {
		return pinionOqzhbAuditop;
	}
	/**
	 * 设置：区智慧办审核时间-年度计划
	 */
	public void setPinionOqzhbDate(Date pinionOqzhbDate) {
		this.pinionOqzhbDate = pinionOqzhbDate;
	}
	/**
	 * 获取：区智慧办审核时间-年度计划
	 */
	public Date getPinionOqzhbDate() {
		return pinionOqzhbDate;
	}
	/**
	 * 设置：领导小组审核人-年度计划
	 */
	public void setPinionOldxzAuditop(String pinionOldxzAuditop) {
		this.pinionOldxzAuditop = pinionOldxzAuditop;
	}
	/**
	 * 获取：领导小组审核人-年度计划
	 */
	public String getPinionOldxzAuditop() {
		return pinionOldxzAuditop;
	}
	/**
	 * 设置：领导小组审核时间-年度计划
	 */
	public void setPinionOldxzDate(Date pinionOldxzDate) {
		this.pinionOldxzDate = pinionOldxzDate;
	}
	/**
	 * 获取：领导小组审核时间-年度计划
	 */
	public Date getPinionOldxzDate() {
		return pinionOldxzDate;
	}
	/**
	 * 设置：区智慧办审核人-初步方案
	 */
	public void setPinionTqzhbAuditop(String pinionTqzhbAuditop) {
		this.pinionTqzhbAuditop = pinionTqzhbAuditop;
	}
	/**
	 * 获取：区智慧办审核人-初步方案
	 */
	public String getPinionTqzhbAuditop() {
		return pinionTqzhbAuditop;
	}
	/**
	 * 设置：区智慧办审核时间-初步方案
	 */
	public void setPinionTqzhbDate(Date pinionTqzhbDate) {
		this.pinionTqzhbDate = pinionTqzhbDate;
	}
	/**
	 * 获取：区智慧办审核时间-初步方案
	 */
	public Date getPinionTqzhbDate() {
		return pinionTqzhbDate;
	}
	/**
	 * 设置：区财政局的审核人-初步方案
	 */
	public void setPinionTqczjAuditop(String pinionTqczjAuditop) {
		this.pinionTqczjAuditop = pinionTqczjAuditop;
	}
	/**
	 * 获取：区财政局的审核人-初步方案
	 */
	public String getPinionTqczjAuditop() {
		return pinionTqczjAuditop;
	}
	/**
	 * 设置：区财政局的审核时间-初步方案
	 */
	public void setPinionTqczjDate(Date pinionTqczjDate) {
		this.pinionTqczjDate = pinionTqczjDate;
	}
	/**
	 * 获取：区财政局的审核时间-初步方案
	 */
	public Date getPinionTqczjDate() {
		return pinionTqczjDate;
	}
	/**
	 * 设置：行政审批局的审核人-初步方案
	 */
	public void setPinionTxzspjAuditop(String pinionTxzspjAuditop) {
		this.pinionTxzspjAuditop = pinionTxzspjAuditop;
	}
	/**
	 * 获取：行政审批局的审核人-初步方案
	 */
	public String getPinionTxzspjAuditop() {
		return pinionTxzspjAuditop;
	}
	/**
	 * 设置：行政审批局的审核时间-初步方案
	 */
	public void setPinionTxzspjDate(Date pinionTxzspjDate) {
		this.pinionTxzspjDate = pinionTxzspjDate;
	}
	/**
	 * 获取：行政审批局的审核时间-初步方案
	 */
	public Date getPinionTxzspjDate() {
		return pinionTxzspjDate;
	}


	/**
	 * 设置：部门的相关信息
	 */
	public void setProjectDept(String projectDept) {
		this.projectDept = projectDept;
	}
	/**
	 * 获取：部门的相关信息
	 */
	public String getProjectDept() {
		return projectDept;
	}

}
