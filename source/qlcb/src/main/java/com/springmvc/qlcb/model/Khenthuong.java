package com.springmvc.qlcb.model;
// Generated Apr 21, 2016 1:56:09 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Khenthuong generated by hbm2java
 */
@Entity
@Table(name = "khenthuong", catalog = "qlcb")
public class Khenthuong implements java.io.Serializable {

	private int maKhenThuong;
	private Canbo canbo;
	private Date ngayKhenThuong;
	private String noiDung;
	private String lyDo;
	private String hinhThucKhenThuong;
	private Integer nguoiXacNhan;
	private boolean daXacNhan;

	public Khenthuong() {
	}

	public Khenthuong(int maKhenThuong, Canbo canbo, Date ngayKhenThuong, String hinhThucKhenThuong,
			boolean daXacNhan) {
		this.maKhenThuong = maKhenThuong;
		this.canbo = canbo;
		this.ngayKhenThuong = ngayKhenThuong;
		this.hinhThucKhenThuong = hinhThucKhenThuong;
		this.daXacNhan = daXacNhan;
	}

	public Khenthuong(int maKhenThuong, Canbo canbo, Date ngayKhenThuong, String noiDung, String lyDo,
			String hinhThucKhenThuong, Integer nguoiXacNhan, boolean daXacNhan) {
		this.maKhenThuong = maKhenThuong;
		this.canbo = canbo;
		this.ngayKhenThuong = ngayKhenThuong;
		this.noiDung = noiDung;
		this.lyDo = lyDo;
		this.hinhThucKhenThuong = hinhThucKhenThuong;
		this.nguoiXacNhan = nguoiXacNhan;
		this.daXacNhan = daXacNhan;
	}

	@Id

	@Column(name = "MaKhenThuong", unique = true, nullable = false)
	public int getMaKhenThuong() {
		return this.maKhenThuong;
	}

	public void setMaKhenThuong(int maKhenThuong) {
		this.maKhenThuong = maKhenThuong;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaCanBo", nullable = false)
	public Canbo getCanbo() {
		return this.canbo;
	}

	public void setCanbo(Canbo canbo) {
		this.canbo = canbo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NgayKhenThuong", nullable = false, length = 10)
	public Date getNgayKhenThuong() {
		return this.ngayKhenThuong;
	}

	public void setNgayKhenThuong(Date ngayKhenThuong) {
		this.ngayKhenThuong = ngayKhenThuong;
	}

	@Column(name = "NoiDung", length = 65535)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Column(name = "LyDo", length = 65535)
	public String getLyDo() {
		return this.lyDo;
	}

	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}

	@Column(name = "HinhThucKhenThuong", nullable = false, length = 65535)
	public String getHinhThucKhenThuong() {
		return this.hinhThucKhenThuong;
	}

	public void setHinhThucKhenThuong(String hinhThucKhenThuong) {
		this.hinhThucKhenThuong = hinhThucKhenThuong;
	}

	@Column(name = "NguoiXacNhan")
	public Integer getNguoiXacNhan() {
		return this.nguoiXacNhan;
	}

	public void setNguoiXacNhan(Integer nguoiXacNhan) {
		this.nguoiXacNhan = nguoiXacNhan;
	}

	@Column(name = "DaXacNhan", nullable = false)
	public boolean isDaXacNhan() {
		return this.daXacNhan;
	}

	public void setDaXacNhan(boolean daXacNhan) {
		this.daXacNhan = daXacNhan;
	}

}
