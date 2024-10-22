package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 房屋报修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@TableName("fangwubaoxiu")
public class FangwubaoxiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangwubaoxiuEntity() {
		
	}
	
	public FangwubaoxiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 合同编号
	 */
					
	private String hetongbianhao;
	
	/**
	 * 房屋名称
	 */
					
	private String fangwumingcheng;
	
	/**
	 * 房屋类型
	 */
					
	private String fangwuleixing;
	
	/**
	 * 小区
	 */
					
	private String xiaoqu;
	
	/**
	 * 报修名称
	 */
					
	private String baoxiumingcheng;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 报修内容
	 */
					
	private String baoxiuneirong;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 报修日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date baoxiuriqi;
	
	/**
	 * 房主账号
	 */
					
	private String fangzhuzhanghao;
	
	/**
	 * 房主姓名
	 */
					
	private String fangzhuxingming;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：合同编号
	 */
	public void setHetongbianhao(String hetongbianhao) {
		this.hetongbianhao = hetongbianhao;
	}
	/**
	 * 获取：合同编号
	 */
	public String getHetongbianhao() {
		return hetongbianhao;
	}
	/**
	 * 设置：房屋名称
	 */
	public void setFangwumingcheng(String fangwumingcheng) {
		this.fangwumingcheng = fangwumingcheng;
	}
	/**
	 * 获取：房屋名称
	 */
	public String getFangwumingcheng() {
		return fangwumingcheng;
	}
	/**
	 * 设置：房屋类型
	 */
	public void setFangwuleixing(String fangwuleixing) {
		this.fangwuleixing = fangwuleixing;
	}
	/**
	 * 获取：房屋类型
	 */
	public String getFangwuleixing() {
		return fangwuleixing;
	}
	/**
	 * 设置：小区
	 */
	public void setXiaoqu(String xiaoqu) {
		this.xiaoqu = xiaoqu;
	}
	/**
	 * 获取：小区
	 */
	public String getXiaoqu() {
		return xiaoqu;
	}
	/**
	 * 设置：报修名称
	 */
	public void setBaoxiumingcheng(String baoxiumingcheng) {
		this.baoxiumingcheng = baoxiumingcheng;
	}
	/**
	 * 获取：报修名称
	 */
	public String getBaoxiumingcheng() {
		return baoxiumingcheng;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：报修内容
	 */
	public void setBaoxiuneirong(String baoxiuneirong) {
		this.baoxiuneirong = baoxiuneirong;
	}
	/**
	 * 获取：报修内容
	 */
	public String getBaoxiuneirong() {
		return baoxiuneirong;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：报修日期
	 */
	public void setBaoxiuriqi(Date baoxiuriqi) {
		this.baoxiuriqi = baoxiuriqi;
	}
	/**
	 * 获取：报修日期
	 */
	public Date getBaoxiuriqi() {
		return baoxiuriqi;
	}
	/**
	 * 设置：房主账号
	 */
	public void setFangzhuzhanghao(String fangzhuzhanghao) {
		this.fangzhuzhanghao = fangzhuzhanghao;
	}
	/**
	 * 获取：房主账号
	 */
	public String getFangzhuzhanghao() {
		return fangzhuzhanghao;
	}
	/**
	 * 设置：房主姓名
	 */
	public void setFangzhuxingming(String fangzhuxingming) {
		this.fangzhuxingming = fangzhuxingming;
	}
	/**
	 * 获取：房主姓名
	 */
	public String getFangzhuxingming() {
		return fangzhuxingming;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
