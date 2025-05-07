package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChukuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChukuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChukuguanliView;


/**
 * 出库管理
 *
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
public interface ChukuguanliService extends IService<ChukuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChukuguanliVO> selectListVO(Wrapper<ChukuguanliEntity> wrapper);
   	
   	ChukuguanliVO selectVO(@Param("ew") Wrapper<ChukuguanliEntity> wrapper);
   	
   	List<ChukuguanliView> selectListView(Wrapper<ChukuguanliEntity> wrapper);
   	
   	ChukuguanliView selectView(@Param("ew") Wrapper<ChukuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChukuguanliEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChukuguanliEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChukuguanliEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChukuguanliEntity> wrapper);



}

