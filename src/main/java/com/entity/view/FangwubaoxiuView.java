package com.entity.view;

import com.entity.FangwubaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房屋报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@TableName("fangwubaoxiu")
public class FangwubaoxiuView  extends FangwubaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangwubaoxiuView(){
	}
 
 	public FangwubaoxiuView(FangwubaoxiuEntity fangwubaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, fangwubaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
