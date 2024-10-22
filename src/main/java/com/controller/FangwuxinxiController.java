package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FangwuxinxiEntity;
import com.entity.view.FangwuxinxiView;

import com.service.FangwuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 房屋信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@RestController
@RequestMapping("/fangwuxinxi")
public class FangwuxinxiController {
    @Autowired
    private FangwuxinxiService fangwuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FangwuxinxiEntity fangwuxinxi, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangzhu")) {
			fangwuxinxi.setFangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FangwuxinxiEntity> ew = new EntityWrapper<FangwuxinxiEntity>();
		PageUtils page = fangwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FangwuxinxiEntity fangwuxinxi, HttpServletRequest request){
        EntityWrapper<FangwuxinxiEntity> ew = new EntityWrapper<FangwuxinxiEntity>();
		PageUtils page = fangwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FangwuxinxiEntity fangwuxinxi){
       	EntityWrapper<FangwuxinxiEntity> ew = new EntityWrapper<FangwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fangwuxinxi, "fangwuxinxi")); 
        return R.ok().put("data", fangwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FangwuxinxiEntity fangwuxinxi){
        EntityWrapper< FangwuxinxiEntity> ew = new EntityWrapper< FangwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fangwuxinxi, "fangwuxinxi")); 
		FangwuxinxiView fangwuxinxiView =  fangwuxinxiService.selectView(ew);
		return R.ok("查询房屋信息成功").put("data", fangwuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FangwuxinxiEntity fangwuxinxi = fangwuxinxiService.selectById(id);
        return R.ok().put("data", fangwuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FangwuxinxiEntity fangwuxinxi = fangwuxinxiService.selectById(id);
        return R.ok().put("data", fangwuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FangwuxinxiEntity fangwuxinxi, HttpServletRequest request){
    	fangwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangwuxinxi);
        fangwuxinxiService.insert(fangwuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FangwuxinxiEntity fangwuxinxi, HttpServletRequest request){
    	fangwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangwuxinxi);
        fangwuxinxiService.insert(fangwuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FangwuxinxiEntity fangwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangwuxinxi);
        fangwuxinxiService.updateById(fangwuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fangwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FangwuxinxiEntity> wrapper = new EntityWrapper<FangwuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangzhu")) {
			wrapper.eq("fangzhuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = fangwuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
