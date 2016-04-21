package com.springmvc.qlcb.model;
// Generated Apr 21, 2016 1:56:09 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Quy generated by hbm2java
 */
@Entity
@Table(name = "quy", catalog = "qlcb")
public class Quy implements java.io.Serializable {

	private int maQuy;
	private String tenQuy;
	private Set<Danhgiacanbo> danhgiacanbos = new HashSet<Danhgiacanbo>(0);

	public Quy() {
	}

	public Quy(int maQuy, String tenQuy) {
		this.maQuy = maQuy;
		this.tenQuy = tenQuy;
	}

	public Quy(int maQuy, String tenQuy, Set<Danhgiacanbo> danhgiacanbos) {
		this.maQuy = maQuy;
		this.tenQuy = tenQuy;
		this.danhgiacanbos = danhgiacanbos;
	}

	@Id

	@Column(name = "MaQuy", unique = true, nullable = false)
	public int getMaQuy() {
		return this.maQuy;
	}

	public void setMaQuy(int maQuy) {
		this.maQuy = maQuy;
	}

	@Column(name = "TenQuy", nullable = false, length = 100)
	public String getTenQuy() {
		return this.tenQuy;
	}

	public void setTenQuy(String tenQuy) {
		this.tenQuy = tenQuy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quy")
	public Set<Danhgiacanbo> getDanhgiacanbos() {
		return this.danhgiacanbos;
	}

	public void setDanhgiacanbos(Set<Danhgiacanbo> danhgiacanbos) {
		this.danhgiacanbos = danhgiacanbos;
	}

}
