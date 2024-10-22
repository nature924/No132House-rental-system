package com.entity.view;

import com.entity.WoyaodangfangzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我要当房主
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@TableName("woyaodangfangzhu")
public class WoyaodangfangzhuView  extends WoyaodangfangzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WoyaodangfangzhuView(){
	}
 
 	public WoyaodangfangzhuView(WoyaodangfangzhuEntity woyaodangfangzhuEntity){
 	try {
			BeanUtils.copyProperties(this, woyaodangfangzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
