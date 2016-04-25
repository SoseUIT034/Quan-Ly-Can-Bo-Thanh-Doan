package com.springmvc.qlcb.model;
// Generated Apr 25, 2016 2:33:53 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Donvi generated by hbm2java
 */
@Entity
@Table(name = "donvi", catalog = "qlcb")
public class Donvi implements java.io.Serializable {

	private int maDonVi;
	private Khoi khoi;
	private String tenDonVi;
	private Integer maTruongDonVi;
	private Date ngayThanhLap;
	private String moTa;
	private Set<Ban> bans = new HashSet<Ban>(0);
	private Set<CanboDonvi> canboDonvis = new HashSet<CanboDonvi>(0);

	public Donvi() {
	}

	public Donvi(int maDonVi, String tenDonVi, Date ngayThanhLap) {
		this.maDonVi = maDonVi;
		this.tenDonVi = tenDonVi;
		this.ngayThanhLap = ngayThanhLap;
	}

	public Donvi(int maDonVi, Khoi khoi, String tenDonVi, Integer maTruongDonVi, Date ngayThanhLap, String moTa,
			Set<Ban> bans, Set<CanboDonvi> canboDonvis) {
		this.maDonVi = maDonVi;
		this.khoi = khoi;
		this.tenDonVi = tenDonVi;
		this.maTruongDonVi = maTruongDonVi;
		this.ngayThanhLap = ngayThanhLap;
		this.moTa = moTa;
		this.bans = bans;
		this.canboDonvis = canboDonvis;
	}

	@Id

	@Column(name = "MaDonVi", unique = true, nullable = false)
	public int getMaDonVi() {
		return this.maDonVi;
	}

	public void setMaDonVi(int maDonVi) {
		this.maDonVi = maDonVi;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaKhoi")
	public Khoi getKhoi() {
		return this.khoi;
	}

	public void setKhoi(Khoi khoi) {
		this.khoi = khoi;
	}

	@Column(name = "TenDonVi", nullable = false, length = 250)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Column(name = "MaTruongDonVi")
	public Integer getMaTruongDonVi() {
		return this.maTruongDonVi;
	}

	public void setMaTruongDonVi(Integer maTruongDonVi) {
		this.maTruongDonVi = maTruongDonVi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NgayThanhLap", nullable = false, length = 10)
	public Date getNgayThanhLap() {
		return this.ngayThanhLap;
	}

	public void setNgayThanhLap(Date ngayThanhLap) {
		this.ngayThanhLap = ngayThanhLap;
	}

	@Column(name = "MoTa", length = 65535)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "donvi")
	public Set<Ban> getBans() {
		return this.bans;
	}

	public void setBans(Set<Ban> bans) {
		this.bans = bans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "donvi")
	public Set<CanboDonvi> getCanboDonvis() {
		return this.canboDonvis;
	}

	public void setCanboDonvis(Set<CanboDonvi> canboDonvis) {
		this.canboDonvis = canboDonvis;
	}

}
