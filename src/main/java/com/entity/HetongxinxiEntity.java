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
 * 合同信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@TableName("hetongxinxi")
public class HetongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HetongxinxiEntity() {
		
	}
	
	public HetongxinxiEntity(T t) {
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
	 * 月租价格
	 */
					
	private String yuezujiage;
	
	/**
	 * 租用月数
	 */
					
	private String zuyongyueshu;
	
	/**
	 * 租用金额
	 */
					
	private Integer zuyongjine;
	
	/**
	 * 押金
	 */
					
	private Integer yajin;
	
	/**
	 * 房租状态
	 */
					
	private String fangzuzhuangtai;
	
	/**
	 * 合同金额
	 */
					
	private String hetongjine;
	
	/**
	 * 合同内容
	 */
					
	private String hetongneirong;
	
	/**
	 * 生效日
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengxiaori;
	
	/**
	 * 有限期至
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date youxianqizhi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
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
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：月租价格
	 */
	public void setYuezujiage(String yuezujiage) {
		this.yuezujiage = yuezujiage;
	}
	/**
	 * 获取：月租价格
	 */
	public String getYuezujiage() {
		return yuezujiage;
	}
	/**
	 * 设置：租用月数
	 */
	public void setZuyongyueshu(String zuyongyueshu) {
		this.zuyongyueshu = zuyongyueshu;
	}
	/**
	 * 获取：租用月数
	 */
	public String getZuyongyueshu() {
		return zuyongyueshu;
	}
	/**
	 * 设置：租用金额
	 */
	public void setZuyongjine(Integer zuyongjine) {
		this.zuyongjine = zuyongjine;
	}
	/**
	 * 获取：租用金额
	 */
	public Integer getZuyongjine() {
		return zuyongjine;
	}
	/**
	 * 设置：押金
	 */
	public void setYajin(Integer yajin) {
		this.yajin = yajin;
	}
	/**
	 * 获取：押金
	 */
	public Integer getYajin() {
		return yajin;
	}
	/**
	 * 设置：房租状态
	 */
	public void setFangzuzhuangtai(String fangzuzhuangtai) {
		this.fangzuzhuangtai = fangzuzhuangtai;
	}
	/**
	 * 获取：房租状态
	 */
	public String getFangzuzhuangtai() {
		return fangzuzhuangtai;
	}
	/**
	 * 设置：合同金额
	 */
	public void setHetongjine(String hetongjine) {
		this.hetongjine = hetongjine;
	}
	/**
	 * 获取：合同金额
	 */
	public String getHetongjine() {
		return hetongjine;
	}
	/**
	 * 设置：合同内容
	 */
	public void setHetongneirong(String hetongneirong) {
		this.hetongneirong = hetongneirong;
	}
	/**
	 * 获取：合同内容
	 */
	public String getHetongneirong() {
		return hetongneirong;
	}
	/**
	 * 设置：生效日
	 */
	public void setShengxiaori(Date shengxiaori) {
		this.shengxiaori = shengxiaori;
	}
	/**
	 * 获取：生效日
	 */
	public Date getShengxiaori() {
		return shengxiaori;
	}
	/**
	 * 设置：有限期至
	 */
	public void setYouxianqizhi(Date youxianqizhi) {
		this.youxianqizhi = youxianqizhi;
	}
	/**
	 * 获取：有限期至
	 */
	public Date getYouxianqizhi() {
		return youxianqizhi;
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
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
