package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FangwubaoxiuDao;
import com.entity.FangwubaoxiuEntity;
import com.service.FangwubaoxiuService;
import com.entity.vo.FangwubaoxiuVO;
import com.entity.view.FangwubaoxiuView;

@Service("fangwubaoxiuService")
public class FangwubaoxiuServiceImpl extends ServiceImpl<FangwubaoxiuDao, FangwubaoxiuEntity> implements FangwubaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangwubaoxiuEntity> page = this.selectPage(
                new Query<FangwubaoxiuEntity>(params).getPage(),
                new EntityWrapper<FangwubaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangwubaoxiuEntity> wrapper) {
		  Page<FangwubaoxiuView> page =new Query<FangwubaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangwubaoxiuVO> selectListVO(Wrapper<FangwubaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangwubaoxiuVO selectVO(Wrapper<FangwubaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangwubaoxiuView> selectListView(Wrapper<FangwubaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangwubaoxiuView selectView(Wrapper<FangwubaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
