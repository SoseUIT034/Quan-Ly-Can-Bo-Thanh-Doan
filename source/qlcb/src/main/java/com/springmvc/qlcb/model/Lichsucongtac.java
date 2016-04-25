package com.springmvc.qlcb.model;
// Generated Apr 25, 2016 1:43:12 PM by Hibernate Tools 4.3.1.Final

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
 * Lichsucongtac generated by hbm2java
 */
@Entity
@Table(name = "lichsucongtac", catalog = "qlcb")
public class Lichsucongtac implements java.io.Serializable {

	private int maLsct;
	private Canbo canbo;
	private Date tuNgay;
	private Date toiNgay;
	private String chucVu;

	public Lichsucongtac() {
	}

	public Lichsucongtac(int maLsct, Canbo canbo) {
		this.maLsct = maLsct;
		this.canbo = canbo;
	}

	public Lichsucongtac(int maLsct, Canbo canbo, Date tuNgay, Date toiNgay, String chucVu) {
		this.maLsct = maLsct;
		this.canbo = canbo;
		this.tuNgay = tuNgay;
		this.toiNgay = toiNgay;
		this.chucVu = chucVu;
	}

	@Id

	@Column(name = "MaLSCT", unique = true, nullable = false)
	public int getMaLsct() {
		return this.maLsct;
	}

	public void setMaLsct(int maLsct) {
		this.maLsct = maLsct;
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
	@Column(name = "TuNgay", length = 10)
	public Date getTuNgay() {
		return this.tuNgay;
	}

	public void setTuNgay(Date tuNgay) {
		this.tuNgay = tuNgay;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ToiNgay", length = 10)
	public Date getToiNgay() {
		return this.toiNgay;
	}

	public void setToiNgay(Date toiNgay) {
		this.toiNgay = toiNgay;
	}

	@Column(name = "ChucVu", length = 65535)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

}
