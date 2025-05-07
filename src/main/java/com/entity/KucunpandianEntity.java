package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 库存盘点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-12-11 16:06:33
 */
@TableName("kucunpandian")
public class KucunpandianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KucunpandianEntity() {
		
	}
	
	public KucunpandianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 货物名称
	 */
					
	private String huowumingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：货物名称
	 */
	public void setHuowumingcheng(String huowumingcheng) {
		this.huowumingcheng = huowumingcheng;
	}
	/**
	 * 获取：货物名称
	 */
	public String getHuowumingcheng() {
		return huowumingcheng;
	}
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
