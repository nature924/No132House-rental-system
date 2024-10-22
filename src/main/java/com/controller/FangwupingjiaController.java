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

import com.entity.FangwupingjiaEntity;
import com.entity.view.FangwupingjiaView;

import com.service.FangwupingjiaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 房屋评价
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-04 18:46:21
 */
@RestController
@RequestMapping("/fangwupingjia")
public class FangwupingjiaController {
    @Autowired
    private FangwupingjiaService fangwupingjiaService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FangwupingjiaEntity fangwupingjia, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangzhu")) {
			fangwupingjia.setFangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			fangwupingjia.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FangwupingjiaEntity> ew = new EntityWrapper<FangwupingjiaEntity>();
		PageUtils page = fangwupingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangwupingjia), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FangwupingjiaEntity fangwupingjia, HttpServletRequest request){
        EntityWrapper<FangwupingjiaEntity> ew = new EntityWrapper<FangwupingjiaEntity>();
		PageUtils page = fangwupingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangwupingjia), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FangwupingjiaEntity fangwupingjia){
       	EntityWrapper<FangwupingjiaEntity> ew = new EntityWrapper<FangwupingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fangwupingjia, "fangwupingjia")); 
        return R.ok().put("data", fangwupingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FangwupingjiaEntity fangwupingjia){
        EntityWrapper< FangwupingjiaEntity> ew = new EntityWrapper< FangwupingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fangwupingjia, "fangwupingjia")); 
		FangwupingjiaView fangwupingjiaView =  fangwupingjiaService.selectView(ew);
		return R.ok("查询房屋评价成功").put("data", fangwupingjiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FangwupingjiaEntity fangwupingjia = fangwupingjiaService.selectById(id);
        return R.ok().put("data", fangwupingjia);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FangwupingjiaEntity fangwupingjia = fangwupingjiaService.selectById(id);
        return R.ok().put("data", fangwupingjia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FangwupingjiaEntity fangwupingjia, HttpServletRequest request){
    	fangwupingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangwupingjia);
        fangwupingjiaService.insert(fangwupingjia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FangwupingjiaEntity fangwupingjia, HttpServletRequest request){
    	fangwupingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangwupingjia);
        fangwupingjiaService.insert(fangwupingjia);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FangwupingjiaEntity fangwupingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangwupingjia);
        fangwupingjiaService.updateById(fangwupingjia);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fangwupingjiaService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<FangwupingjiaEntity> wrapper = new EntityWrapper<FangwupingjiaEntity>();
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
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = fangwupingjiaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
