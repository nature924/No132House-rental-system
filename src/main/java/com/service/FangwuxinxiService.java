package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwuxinxiView;


/**
 * 房屋信息
 *
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
public interface FangwuxinxiService extends IService<FangwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwuxinxiVO> selectListVO(Wrapper<FangwuxinxiEntity> wrapper);
   	
   	FangwuxinxiVO selectVO(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);
   	
   	List<FangwuxinxiView> selectListView(Wrapper<FangwuxinxiEntity> wrapper);
   	
   	FangwuxinxiView selectView(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwuxinxiEntity> wrapper);
   	
}

