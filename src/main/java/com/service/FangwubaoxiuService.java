package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwubaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwubaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwubaoxiuView;


/**
 * 房屋报修
 *
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
public interface FangwubaoxiuService extends IService<FangwubaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwubaoxiuVO> selectListVO(Wrapper<FangwubaoxiuEntity> wrapper);
   	
   	FangwubaoxiuVO selectVO(@Param("ew") Wrapper<FangwubaoxiuEntity> wrapper);
   	
   	List<FangwubaoxiuView> selectListView(Wrapper<FangwubaoxiuEntity> wrapper);
   	
   	FangwubaoxiuView selectView(@Param("ew") Wrapper<FangwubaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwubaoxiuEntity> wrapper);
   	
}

