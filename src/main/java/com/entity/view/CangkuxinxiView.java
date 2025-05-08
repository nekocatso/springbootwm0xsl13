package com.entity.view;

import com.entity.CangkuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 仓库信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-12-11 16:06:34
 */
@TableName("cangkuxinxi")
public class CangkuxinxiView  extends CangkuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CangkuxinxiView() {
	}
	
	public CangkuxinxiView(CangkuxinxiEntity cangkuxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, cangkuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	public CangkuxinxiView(Object t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
