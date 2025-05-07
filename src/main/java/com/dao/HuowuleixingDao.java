package com.dao;

import com.entity.HuowuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowuleixingVO;
import com.entity.view.HuowuleixingView;


/**
 * 货物类型
 * 
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
public interface HuowuleixingDao extends BaseMapper<HuowuleixingEntity> {
	
	List<HuowuleixingVO> selectListVO(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
	
	HuowuleixingVO selectVO(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
	
	List<HuowuleixingView> selectListView(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);

	List<HuowuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuowuleixingEntity> wrapper);

	
	HuowuleixingView selectView(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
	

}
