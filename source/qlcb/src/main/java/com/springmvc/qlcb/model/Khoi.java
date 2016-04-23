package com.springmvc.qlcb.model;
// Generated Apr 23, 2016 3:25:20 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Khoi generated by hbm2java
 */
@Entity
@Table(name = "khoi", catalog = "qlcb")
public class Khoi implements java.io.Serializable {

	private int maKhoi;
	private String tenKhoi;
	private Set<Donvi> donvis = new HashSet<Donvi>(0);

	public Khoi() {
	}

	public Khoi(int maKhoi) {
		this.maKhoi = maKhoi;
	}

	public Khoi(int maKhoi, String tenKhoi, Set<Donvi> donvis) {
		this.maKhoi = maKhoi;
		this.tenKhoi = tenKhoi;
		this.donvis = donvis;
	}

	@Id

	@Column(name = "MaKhoi", unique = true, nullable = false)
	public int getMaKhoi() {
		return this.maKhoi;
	}

	public void setMaKhoi(int maKhoi) {
		this.maKhoi = maKhoi;
	}

	@Column(name = "TenKhoi", length = 505)
	public String getTenKhoi() {
		return this.tenKhoi;
	}

	public void setTenKhoi(String tenKhoi) {
		this.tenKhoi = tenKhoi;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khoi")
	public Set<Donvi> getDonvis() {
		return this.donvis;
	}

	public void setDonvis(Set<Donvi> donvis) {
		this.donvis = donvis;
	}

}
