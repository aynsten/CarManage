package com.car.entity.pgis;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="t_car_fence_define")
public class TCarFenceDefine implements Serializable{

	/**
	 * 
	 */

	private static final long serialVersionUID = 6450060389352682572L;

	private String dictIdRegion;//区域id
	private String points;//边界值
	private Integer fenceKind;//电子围栏种类：1代表围栏边界的点集合；2圆形
	private String fenceCenter;//圆心坐标：电子围栏种类2应用
	private Double fenceRadius;//围栏半径（km）：电子围栏种类2应用
	@Id
	@Column(name = "dictIdRegion", nullable = false, length = 36)
	public String getDictIdRegion() {
		return dictIdRegion;
	}
	public void setDictIdRegion(String dictIdRegion) {
		this.dictIdRegion = dictIdRegion;
	}
	@Column(name = "points")
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	@Column(name = "fenceKind", nullable = false)
	public Integer getFenceKind() {
		return fenceKind;
	}
	public void setFenceKind(Integer fenceKind) {
		this.fenceKind = fenceKind;
	}
	@Column(name = "fenceCenter")
	public String getFenceCenter() {
		return fenceCenter;
	}
	public void setFenceCenter(String fenceCenter) {
		this.fenceCenter = fenceCenter;
	}
	@Column(name = "fenceRadius")
	public Double getFenceRadius() {
		return fenceRadius;
	}
	public void setFenceRadius(Double fenceRadius) {
		this.fenceRadius = fenceRadius;
	}
	
	
	
	
}
