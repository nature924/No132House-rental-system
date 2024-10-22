package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwupingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwupingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwupingjiaView;


/**
 * 房屋评价
 *
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
public interface FangwupingjiaService extends IService<FangwupingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwupingjiaVO> selectListVO(Wrapper<FangwupingjiaEntity> wrapper);
   	
   	FangwupingjiaVO selectVO(@Param("ew") Wrapper<FangwupingjiaEntity> wrapper);
   	
   	List<FangwupingjiaView> selectListView(Wrapper<FangwupingjiaEntity> wrapper);
   	
   	FangwupingjiaView selectView(@Param("ew") Wrapper<FangwupingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwupingjiaEntity> wrapper);
   	
}

