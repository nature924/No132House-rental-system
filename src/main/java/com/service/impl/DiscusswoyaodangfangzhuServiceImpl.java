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


import com.dao.DiscusswoyaodangfangzhuDao;
import com.entity.DiscusswoyaodangfangzhuEntity;
import com.service.DiscusswoyaodangfangzhuService;
import com.entity.vo.DiscusswoyaodangfangzhuVO;
import com.entity.view.DiscusswoyaodangfangzhuView;

@Service("discusswoyaodangfangzhuService")
public class DiscusswoyaodangfangzhuServiceImpl extends ServiceImpl<DiscusswoyaodangfangzhuDao, DiscusswoyaodangfangzhuEntity> implements DiscusswoyaodangfangzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswoyaodangfangzhuEntity> page = this.selectPage(
                new Query<DiscusswoyaodangfangzhuEntity>(params).getPage(),
                new EntityWrapper<DiscusswoyaodangfangzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswoyaodangfangzhuEntity> wrapper) {
		  Page<DiscusswoyaodangfangzhuView> page =new Query<DiscusswoyaodangfangzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswoyaodangfangzhuVO> selectListVO(Wrapper<DiscusswoyaodangfangzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswoyaodangfangzhuVO selectVO(Wrapper<DiscusswoyaodangfangzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswoyaodangfangzhuView> selectListView(Wrapper<DiscusswoyaodangfangzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswoyaodangfangzhuView selectView(Wrapper<DiscusswoyaodangfangzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
