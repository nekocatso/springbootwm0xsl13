package com.entity.vo;

import com.entity.ChukuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 
public class ChukuguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	private String huowumingcheng;
		
	private String huowuleixing;
		
	private String guige;
		
	private Integer shuliang;
		
	private Integer shoujia;
		
	private Integer zongjia;
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
		
	private String chukubeizhu;
		
	private String huowutupian;
		
	private String yuangonggonghao;
		
	private String yuangongxingming;
				
	public void setHuowumingcheng(String huowumingcheng) {
		this.huowumingcheng = huowumingcheng;
	}
	
	public String getHuowumingcheng() {
		return huowumingcheng;
	}
				
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
				
	public void setShoujia(Integer shoujia) {
		this.shoujia = shoujia;
	}
	
	public Integer getShoujia() {
		return shoujia;
	}
				
	public void setZongjia(Integer zongjia) {
		this.zongjia = zongjia;
	}
	
	public Integer getZongjia() {
		return zongjia;
	}
				
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	public Date getChukushijian() {
		return chukushijian;
	}
				
	public void setChukubeizhu(String chukubeizhu) {
		this.chukubeizhu = chukubeizhu;
	}
	
	public String getChukubeizhu() {
		return chukubeizhu;
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
