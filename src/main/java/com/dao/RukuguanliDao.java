package com.dao;

import com.entity.RukuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RukuguanliVO;
import com.entity.view.RukuguanliView;


/**
 * 入库管理
 * 
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
public interface RukuguanliDao extends BaseMapper<RukuguanliEntity> {
	
	List<RukuguanliVO> selectListVO(@Param("ew") Wrapper<RukuguanliEntity> wrapper);
	
	RukuguanliVO selectVO(@Param("ew") Wrapper<RukuguanliEntity> wrapper);
	
	List<RukuguanliView> selectListView(@Param("ew") Wrapper<RukuguanliEntity> wrapper);

	List<RukuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<RukuguanliEntity> wrapper);

	
	RukuguanliView selectView(@Param("ew") Wrapper<RukuguanliEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RukuguanliEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RukuguanliEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RukuguanliEntity> wrapper);



}
