package com.entity.view;

import com.entity.HuowuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 货物信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
@TableName("huowuxinxi")
public class HuowuxinxiView  extends HuowuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuowuxinxiView() {
	}
	
	public HuowuxinxiView(HuowuxinxiEntity huowuxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, huowuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	public HuowuxinxiView(Object t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
