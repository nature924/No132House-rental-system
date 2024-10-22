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


import com.dao.FangwuxinxiDao;
import com.entity.FangwuxinxiEntity;
import com.service.FangwuxinxiService;
import com.entity.vo.FangwuxinxiVO;
import com.entity.view.FangwuxinxiView;

@Service("fangwuxinxiService")
public class FangwuxinxiServiceImpl extends ServiceImpl<FangwuxinxiDao, FangwuxinxiEntity> implements FangwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangwuxinxiEntity> page = this.selectPage(
                new Query<FangwuxinxiEntity>(params).getPage(),
                new EntityWrapper<FangwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangwuxinxiEntity> wrapper) {
		  Page<FangwuxinxiView> page =new Query<FangwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangwuxinxiVO> selectListVO(Wrapper<FangwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangwuxinxiVO selectVO(Wrapper<FangwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangwuxinxiView> selectListView(Wrapper<FangwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangwuxinxiView selectView(Wrapper<FangwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
