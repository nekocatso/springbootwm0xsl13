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

import com.entity.GongyingshangEntity;
import com.entity.view.GongyingshangView;

import com.service.GongyingshangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 供应商
 * 后端接口
 * @author 
 * @email 
 * @date 2024-12-11 16:06:34
 */
@RestController
@RequestMapping("/gongyingshang")
public class GongyingshangController {
    @Autowired
    private GongyingshangService gongyingshangService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongyingshangEntity gongyingshang,
		HttpServletRequest request){
        EntityWrapper<GongyingshangEntity> ew = new EntityWrapper<GongyingshangEntity>();



		PageUtils page = gongyingshangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongyingshang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongyingshangEntity gongyingshang, 
		HttpServletRequest request){
        EntityWrapper<GongyingshangEntity> ew = new EntityWrapper<GongyingshangEntity>();

		PageUtils page = gongyingshangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongyingshang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongyingshangEntity gongyingshang){
       	EntityWrapper<GongyingshangEntity> ew = new EntityWrapper<GongyingshangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongyingshang, "gongyingshang")); 
        return R.ok().put("data", gongyingshangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongyingshangEntity gongyingshang){
        EntityWrapper< GongyingshangEntity> ew = new EntityWrapper< GongyingshangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongyingshang, "gongyingshang")); 
		GongyingshangView gongyingshangView =  gongyingshangService.selectView(ew);
		return R.ok("查询供应商成功").put("data", gongyingshangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongyingshangEntity gongyingshang = gongyingshangService.selectById(id);
        return R.ok().put("data", gongyingshang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongyingshangEntity gongyingshang = gongyingshangService.selectById(id);
        return R.ok().put("data", gongyingshang);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongyingshangEntity gongyingshang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gongyingshang);
        gongyingshangService.insert(gongyingshang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongyingshangEntity gongyingshang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gongyingshang);
        gongyingshangService.insert(gongyingshang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GongyingshangEntity gongyingshang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongyingshang);
        gongyingshangService.updateById(gongyingshang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongyingshangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	











}
