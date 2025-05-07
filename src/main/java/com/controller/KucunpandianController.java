package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KucunpandianEntity;
import com.entity.view.KucunpandianView;

import com.service.KucunpandianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 库存盘点
 * 后端接口
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
@RestController
@RequestMapping("/kucunpandian")
public class KucunpandianController {
    @Autowired
    private KucunpandianService kucunpandianService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KucunpandianEntity kucunpandian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			kucunpandian.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KucunpandianEntity> ew = new EntityWrapper<KucunpandianEntity>();



		PageUtils page = kucunpandianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kucunpandian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KucunpandianEntity kucunpandian, 
		HttpServletRequest request){
        EntityWrapper<KucunpandianEntity> ew = new EntityWrapper<KucunpandianEntity>();

		PageUtils page = kucunpandianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kucunpandian), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KucunpandianEntity kucunpandian){
       	EntityWrapper<KucunpandianEntity> ew = new EntityWrapper<KucunpandianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kucunpandian, "kucunpandian")); 
        return R.ok().put("data", kucunpandianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KucunpandianEntity kucunpandian){
        EntityWrapper< KucunpandianEntity> ew = new EntityWrapper< KucunpandianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kucunpandian, "kucunpandian")); 
		KucunpandianView kucunpandianView =  kucunpandianService.selectView(ew);
		return R.ok("查询库存盘点成功").put("data", kucunpandianView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KucunpandianEntity kucunpandian = kucunpandianService.selectById(id);
        return R.ok().put("data", kucunpandian);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KucunpandianEntity kucunpandian = kucunpandianService.selectById(id);
        return R.ok().put("data", kucunpandian);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KucunpandianEntity kucunpandian, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kucunpandian);
        kucunpandianService.insert(kucunpandian);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KucunpandianEntity kucunpandian, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kucunpandian);
        kucunpandianService.insert(kucunpandian);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KucunpandianEntity kucunpandian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kucunpandian);
        kucunpandianService.updateById(kucunpandian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kucunpandianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	











}
