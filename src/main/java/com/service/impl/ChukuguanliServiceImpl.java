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


import com.dao.ChukuguanliDao;
import com.entity.ChukuguanliEntity;
import com.service.ChukuguanliService;
import com.entity.vo.ChukuguanliVO;
import com.entity.view.ChukuguanliView;

@Service("chukuguanliService")
public class ChukuguanliServiceImpl extends ServiceImpl<ChukuguanliDao, ChukuguanliEntity> implements ChukuguanliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChukuguanliEntity> page = this.selectPage(
                new Query<ChukuguanliEntity>(params).getPage(),
                new EntityWrapper<ChukuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChukuguanliEntity> wrapper) {
		  Page<ChukuguanliView> page =new Query<ChukuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChukuguanliVO> selectListVO(Wrapper<ChukuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChukuguanliVO selectVO(Wrapper<ChukuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChukuguanliView> selectListView(Wrapper<ChukuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChukuguanliView selectView(Wrapper<ChukuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ChukuguanliEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ChukuguanliEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ChukuguanliEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
