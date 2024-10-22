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
 * 预约看房
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@TableName("yuyuekanfang")
public class YuyuekanfangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuyuekanfangEntity() {
		
	}
	
	public YuyuekanfangEntity(T t) {
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
	 * 预约编号
	 */
					
	private String yuyuebianhao;
	
	/**
	 * 房屋名称
	 */
					
	private String fangwumingcheng;
	
	/**
	 * 房屋类型
	 */
					
	private String fangwuleixing;
	
	/**
	 * 房屋状态
	 */
					
	private String fangwuzhuangtai;
	
	/**
	 * 小区
	 */
					
	private String xiaoqu;
	
	/**
	 * 月租价格
	 */
					
	private Integer yuezujiage;
	
	/**
	 * 押金
	 */
					
	private String yajin;
	
	/**
	 * 租用月数
	 */
					
	private Integer zuyongyueshu;
	
	/**
	 * 租用金额
	 */
					
	private String zuyongjine;
	
	/**
	 * 预约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 房主账号
	 */
					
	private String fangzhuzhanghao;
	
	/**
	 * 房主姓名
	 */
					
	private String fangzhuxingming;
	
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
	 * 设置：预约编号
	 */
	public void setYuyuebianhao(String yuyuebianhao) {
		this.yuyuebianhao = yuyuebianhao;
	}
	/**
	 * 获取：预约编号
	 */
	public String getYuyuebianhao() {
		return yuyuebianhao;
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
	 * 设置：房屋状态
	 */
	public void setFangwuzhuangtai(String fangwuzhuangtai) {
		this.fangwuzhuangtai = fangwuzhuangtai;
	}
	/**
	 * 获取：房屋状态
	 */
	public String getFangwuzhuangtai() {
		return fangwuzhuangtai;
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
	 * 设置：押金
	 */
	public void setYajin(String yajin) {
		this.yajin = yajin;
	}
	/**
	 * 获取：押金
	 */
	public String getYajin() {
		return yajin;
	}
	/**
	 * 设置：租用月数
	 */
	public void setZuyongyueshu(Integer zuyongyueshu) {
		this.zuyongyueshu = zuyongyueshu;
	}
	/**
	 * 获取：租用月数
	 */
	public Integer getZuyongyueshu() {
		return zuyongyueshu;
	}
	/**
	 * 设置：租用金额
	 */
	public void setZuyongjine(String zuyongjine) {
		this.zuyongjine = zuyongjine;
	}
	/**
	 * 获取：租用金额
	 */
	public String getZuyongjine() {
		return zuyongjine;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
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
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
