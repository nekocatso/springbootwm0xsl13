package com.entity.model;

import com.entity.KucunpandianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 库存盘点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
public class KucunpandianModel  implements Serializable {
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
	 * 库存量
	 */
	
	private Integer shuliang;
		
	/**
	 * 盘点数量
	 */
	
	private Integer pandianshuliang;
		
	/**
	 * 盘点时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pandianshijian;
		
	/**
	 * 盘点备注
	 */
	
	private String pandianbeizhu;
		
	/**
	 * 货物图片
	 */
	
	private String huowutupian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
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
	 * 设置：库存量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：库存量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：盘点数量
	 */
	 
	public void setPandianshuliang(Integer pandianshuliang) {
		this.pandianshuliang = pandianshuliang;
	}
	
	/**
	 * 获取：盘点数量
	 */
	public Integer getPandianshuliang() {
		return pandianshuliang;
	}
				
	
	/**
	 * 设置：盘点时间
	 */
	 
	public void setPandianshijian(Date pandianshijian) {
		this.pandianshijian = pandianshijian;
	}
	
	/**
	 * 获取：盘点时间
	 */
	public Date getPandianshijian() {
		return pandianshijian;
	}
				
	
	/**
	 * 设置：盘点备注
	 */
	 
	public void setPandianbeizhu(String pandianbeizhu) {
		this.pandianbeizhu = pandianbeizhu;
	}
	
	/**
	 * 获取：盘点备注
	 */
	public String getPandianbeizhu() {
		return pandianbeizhu;
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
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
			
}
