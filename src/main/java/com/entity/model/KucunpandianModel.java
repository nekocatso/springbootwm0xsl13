package com.entity.model;

import com.entity.KucunpandianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

public class KucunpandianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	private String huowuleixing;
	private String guige;
	private Integer shuliang;
	private Integer pandianshuliang;

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pandianshijian;

	private String pandianbeizhu;
	private String huowutupian;
	private String yuangonggonghao;
	private String yuangongxingming;

	public void setHuowuleixing(String huowuleixing) {
		this.huowuleixing = huowuleixing;
	}

	public String getHuowuleixing() {
		return huowuleixing;
	}

	public void setGuige(String guige) {
		this.guige = guige;
	}

	public String getGuige() {
		return guige;
	}

	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}

	public Integer getShuliang() {
		return shuliang;
	}

	public void setPandianshuliang(Integer pandianshuliang) {
		this.pandianshuliang = pandianshuliang;
	}

	public Integer getPandianshuliang() {
		return pandianshuliang;
	}

	public void setPandianshijian(Date pandianshijian) {
		this.pandianshijian = pandianshijian;
	}

	public Date getPandianshijian() {
		return pandianshijian;
	}

	public void setPandianbeizhu(String pandianbeizhu) {
		this.pandianbeizhu = pandianbeizhu;
	}

	public String getPandianbeizhu() {
		return pandianbeizhu;
	}

	public void setHuowutupian(String huowutupian) {
		this.huowutupian = huowutupian;
	}

	public String getHuowutupian() {
		return huowutupian;
	}

	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}

	public String getYuangonggonghao() {
		return yuangonggonghao;
	}

	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}

	public String getYuangongxingming() {
		return yuangongxingming;
	}
}
