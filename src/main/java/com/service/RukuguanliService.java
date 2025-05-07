package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RukuguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RukuguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RukuguanliView;


/**
 * 入库管理
 *
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
public interface RukuguanliService extends IService<RukuguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RukuguanliVO> selectListVO(Wrapper<RukuguanliEntity> wrapper);
   	
   	RukuguanliVO selectVO(@Param("ew") Wrapper<RukuguanliEntity> wrapper);
   	
   	List<RukuguanliView> selectListView(Wrapper<RukuguanliEntity> wrapper);
   	
   	RukuguanliView selectView(@Param("ew") Wrapper<RukuguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RukuguanliEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<RukuguanliEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<RukuguanliEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<RukuguanliEntity> wrapper);



}

