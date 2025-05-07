package com.dao;

import com.entity.ChukuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChukuguanliVO;
import com.entity.view.ChukuguanliView;


/**
 * 出库管理
 * 
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
public interface ChukuguanliDao extends BaseMapper<ChukuguanliEntity> {
	
	List<ChukuguanliVO> selectListVO(@Param("ew") Wrapper<ChukuguanliEntity> wrapper);
	
	ChukuguanliVO selectVO(@Param("ew") Wrapper<ChukuguanliEntity> wrapper);
	
	List<ChukuguanliView> selectListView(@Param("ew") Wrapper<ChukuguanliEntity> wrapper);

	List<ChukuguanliView> selectListView(Pagination page,@Param("ew") Wrapper<ChukuguanliEntity> wrapper);

	
	ChukuguanliView selectView(@Param("ew") Wrapper<ChukuguanliEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChukuguanliEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChukuguanliEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChukuguanliEntity> wrapper);



}
