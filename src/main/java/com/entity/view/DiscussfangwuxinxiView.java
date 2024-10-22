package com.entity.view;

import com.entity.DiscussfangwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房屋信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@TableName("discussfangwuxinxi")
public class DiscussfangwuxinxiView  extends DiscussfangwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfangwuxinxiView(){
	}
 
 	public DiscussfangwuxinxiView(DiscussfangwuxinxiEntity discussfangwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussfangwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
