package com.entity.vo;

import com.entity.HuowuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 货物信息
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
public class HuowuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 货物类型
	 */
	
	private String huowuleixing;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 库存
	 */
	
	private Integer shuliang;
		
	/**
	 * 进价
	 */
	
	private Integer jinjia;
		
	/**
	 * 售价
	 */
	
	private Integer shoujia;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 仓库号
	 */
	
	private String cangkuhao;
		
	/**
	 * 货物介绍
	 */
	
	private String huowujieshao;
		
	/**
	 * 货物图片
	 */
	
	private String huowutupian;
				
	
	/**
	 * 设置：货物类型
	 */
	 
	public void setHuowuleixing(String huowuleixing) {
		this.huowuleixing = huowuleixing;
	}
	
	/**
	 * 获取：货物类型
	 */
	public String getHuowuleixing() {
		return huowuleixing;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：进价
	 */
	 
	public void setJinjia(Integer jinjia) {
		this.jinjia = jinjia;
	}
	
	/**
	 * 获取：进价
	 */
	public Integer getJinjia() {
		return jinjia;
	}
				
	
	/**
	 * 设置：售价
	 */
	 
	public void setShoujia(Integer shoujia) {
		this.shoujia = shoujia;
	}
	
	/**
	 * 获取：售价
	 */
	public Integer getShoujia() {
		return shoujia;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：仓库号
	 */
	 
	public void setCangkuhao(String cangkuhao) {
		this.cangkuhao = cangkuhao;
	}
	
	/**
	 * 获取：仓库号
	 */
	public String getCangkuhao() {
		return cangkuhao;
	}
				
	
	/**
	 * 设置：货物介绍
	 */
	 
	public void setHuowujieshao(String huowujieshao) {
		this.huowujieshao = huowujieshao;
	}
	
	/**
	 * 获取：货物介绍
	 */
	public String getHuowujieshao() {
		return huowujieshao;
	}
				
	
	/**
	 * 设置：货物图片
	 */
	 
	public void setHuowutupian(String huowutupian) {
		this.huowutupian = huowutupian;
	}
	
	/**
	 * 获取：货物图片
	 */
	public String getHuowutupian() {
		return huowutupian;
	}
			
}
