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
 * 我要当房主
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@TableName("woyaodangfangzhu")
public class WoyaodangfangzhuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WoyaodangfangzhuEntity() {
		
	}
	
	public WoyaodangfangzhuEntity(T t) {
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
	 * 房屋名称
	 */
					
	private String fangwumingcheng;
	
	/**
	 * 房屋类型
	 */
					
	private String fangwuleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 租赁方式
	 */
					
	private String zulinfangshi;
	
	/**
	 * 朝向楼层
	 */
					
	private String chaoxianglouceng;
	
	/**
	 * 小区
	 */
					
	private String xiaoqu;
	
	/**
	 * 面积
	 */
					
	private String mianji;
	
	/**
	 * 月租价格
	 */
					
	private Integer yuezujiage;
	
	/**
	 * 房屋详情
	 */
					
	private String fangwuxiangqing;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
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
	 * 设置：租赁方式
	 */
	public void setZulinfangshi(String zulinfangshi) {
		this.zulinfangshi = zulinfangshi;
	}
	/**
	 * 获取：租赁方式
	 */
	public String getZulinfangshi() {
		return zulinfangshi;
	}
	/**
	 * 设置：朝向楼层
	 */
	public void setChaoxianglouceng(String chaoxianglouceng) {
		this.chaoxianglouceng = chaoxianglouceng;
	}
	/**
	 * 获取：朝向楼层
	 */
	public String getChaoxianglouceng() {
		return chaoxianglouceng;
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
	 * 设置：面积
	 */
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
	/**
	 * 设置：月租价格
	 */
	public void setYuezujiage(Integer yuezujiage) {
		this.yuezujiage = yuezujiage;
	}
	/**
	 * 获取：月租价格
	 */
	public Integer getYuezujiage() {
		return yuezujiage;
	}
	/**
	 * 设置：房屋详情
	 */
	public void setFangwuxiangqing(String fangwuxiangqing) {
		this.fangwuxiangqing = fangwuxiangqing;
	}
	/**
	 * 获取：房屋详情
	 */
	public String getFangwuxiangqing() {
		return fangwuxiangqing;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
