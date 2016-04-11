package com.springmvc.qlcb.model;
// Generated Apr 11, 2016 10:54:37 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LoaiHinhBan generated by hbm2java
 */
@Entity
@Table(name = "loai_hinh_ban", catalog = "qlcb")
public class LoaiHinhBan implements java.io.Serializable {

	private Byte maLoaiBan;
	private KieuLoaiHinhBan kieuLoaiHinhBan;
	private String tenLoaiHinhBan;
	private String moTa;
	private Set<Ban> bans = new HashSet<Ban>(0);

	public LoaiHinhBan() {
	}

	public LoaiHinhBan(KieuLoaiHinhBan kieuLoaiHinhBan, String tenLoaiHinhBan, String moTa, Set<Ban> bans) {
		this.kieuLoaiHinhBan = kieuLoaiHinhBan;
		this.tenLoaiHinhBan = tenLoaiHinhBan;
		this.moTa = moTa;
		this.bans = bans;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Ma_Loai_Ban", unique = true, nullable = false)
	public Byte getMaLoaiBan() {
		return this.maLoaiBan;
	}

	public void setMaLoaiBan(Byte maLoaiBan) {
		this.maLoaiBan = maLoaiBan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ma_Kieu_Loai_Hinh")
	public KieuLoaiHinhBan getKieuLoaiHinhBan() {
		return this.kieuLoaiHinhBan;
	}

	public void setKieuLoaiHinhBan(KieuLoaiHinhBan kieuLoaiHinhBan) {
		this.kieuLoaiHinhBan = kieuLoaiHinhBan;
	}

	@Column(name = "Ten_Loai_Hinh_Ban", length = 62)
	public String getTenLoaiHinhBan() {
		return this.tenLoaiHinhBan;
	}

	public void setTenLoaiHinhBan(String tenLoaiHinhBan) {
		this.tenLoaiHinhBan = tenLoaiHinhBan;
	}

	@Column(name = "Mo_Ta", length = 254)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loaiHinhBan")
	public Set<Ban> getBans() {
		return this.bans;
	}

	public void setBans(Set<Ban> bans) {
		this.bans = bans;
	}

}