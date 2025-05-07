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


import com.dao.RukuguanliDao;
import com.entity.RukuguanliEntity;
import com.service.RukuguanliService;
import com.entity.vo.RukuguanliVO;
import com.entity.view.RukuguanliView;

@Service("rukuguanliService")
public class RukuguanliServiceImpl extends ServiceImpl<RukuguanliDao, RukuguanliEntity> implements RukuguanliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RukuguanliEntity> page = this.selectPage(
                new Query<RukuguanliEntity>(params).getPage(),
                new EntityWrapper<RukuguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RukuguanliEntity> wrapper) {
		  Page<RukuguanliView> page =new Query<RukuguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<RukuguanliVO> selectListVO(Wrapper<RukuguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RukuguanliVO selectVO(Wrapper<RukuguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RukuguanliView> selectListView(Wrapper<RukuguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RukuguanliView selectView(Wrapper<RukuguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<RukuguanliEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<RukuguanliEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<RukuguanliEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
