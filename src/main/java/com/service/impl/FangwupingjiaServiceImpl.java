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


import com.dao.FangwupingjiaDao;
import com.entity.FangwupingjiaEntity;
import com.service.FangwupingjiaService;
import com.entity.vo.FangwupingjiaVO;
import com.entity.view.FangwupingjiaView;

@Service("fangwupingjiaService")
public class FangwupingjiaServiceImpl extends ServiceImpl<FangwupingjiaDao, FangwupingjiaEntity> implements FangwupingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangwupingjiaEntity> page = this.selectPage(
                new Query<FangwupingjiaEntity>(params).getPage(),
                new EntityWrapper<FangwupingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangwupingjiaEntity> wrapper) {
		  Page<FangwupingjiaView> page =new Query<FangwupingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangwupingjiaVO> selectListVO(Wrapper<FangwupingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangwupingjiaVO selectVO(Wrapper<FangwupingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangwupingjiaView> selectListView(Wrapper<FangwupingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangwupingjiaView selectView(Wrapper<FangwupingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
