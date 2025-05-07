package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowuleixingView;


/**
 * 货物类型
 *
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
public interface HuowuleixingService extends IService<HuowuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowuleixingVO> selectListVO(Wrapper<HuowuleixingEntity> wrapper);
   	
   	HuowuleixingVO selectVO(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
   	
   	List<HuowuleixingView> selectListView(Wrapper<HuowuleixingEntity> wrapper);
   	
   	HuowuleixingView selectView(@Param("ew") Wrapper<HuowuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowuleixingEntity> wrapper);

   	

}

