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
 * 维修处理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@TableName("weixiuchuli")
public class WeixiuchuliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiuchuliEntity() {
		
	}
	
	public WeixiuchuliEntity(T t) {
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
	 * 报修名称
	 */
					
	private String baoxiumingcheng;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 报修日期
	 */
					
	private String baoxiuriqi;
	
	/**
	 * 维修反馈
	 */
					
	private String weixiufankui;
	
	/**
	 * 维修进度
	 */
					
	private String weixiujindu;
	
	/**
	 * 更新日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date gengxinriqi;
	
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
	 * 设置：报修日期
	 */
	public void setBaoxiuriqi(String baoxiuriqi) {
		this.baoxiuriqi = baoxiuriqi;
	}
	/**
	 * 获取：报修日期
	 */
	public String getBaoxiuriqi() {
		return baoxiuriqi;
	}
	/**
	 * 设置：维修反馈
	 */
	public void setWeixiufankui(String weixiufankui) {
		this.weixiufankui = weixiufankui;
	}
	/**
	 * 获取：维修反馈
	 */
	public String getWeixiufankui() {
		return weixiufankui;
	}
	/**
	 * 设置：维修进度
	 */
	public void setWeixiujindu(String weixiujindu) {
		this.weixiujindu = weixiujindu;
	}
	/**
	 * 获取：维修进度
	 */
	public String getWeixiujindu() {
		return weixiujindu;
	}
	/**
	 * 设置：更新日期
	 */
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
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

}
