package com.springmvc.qlcb.model;
// Generated Apr 11, 2016 10:54:37 AM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MucSuaDoi generated by hbm2java
 */
@Entity
@Table(name = "muc_sua_doi", catalog = "qlcb")
public class MucSuaDoi implements java.io.Serializable {

	private MucSuaDoiId id;
	private YeuCauThayDoiTtCb yeuCauThayDoiTtCb;
	private String giaTriThayDoi;
	private String tenHienThi;

	public MucSuaDoi() {
	}

	public MucSuaDoi(MucSuaDoiId id, YeuCauThayDoiTtCb yeuCauThayDoiTtCb) {
		this.id = id;
		this.yeuCauThayDoiTtCb = yeuCauThayDoiTtCb;
	}

	public MucSuaDoi(MucSuaDoiId id, YeuCauThayDoiTtCb yeuCauThayDoiTtCb, String giaTriThayDoi, String tenHienThi) {
		this.id = id;
		this.yeuCauThayDoiTtCb = yeuCauThayDoiTtCb;
		this.giaTriThayDoi = giaTriThayDoi;
		this.tenHienThi = tenHienThi;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "maYeuCau", column = @Column(name = "Ma_Yeu_Cau", nullable = false)),
			@AttributeOverride(name = "tenCotThayDoi", column = @Column(name = "Ten_Cot_Thay_Doi", nullable = false, length = 254)) })
	public MucSuaDoiId getId() {
		return this.id;
	}

	public void setId(MucSuaDoiId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ma_Yeu_Cau", nullable = false, insertable = false, updatable = false)
	public YeuCauThayDoiTtCb getYeuCauThayDoiTtCb() {
		return this.yeuCauThayDoiTtCb;
	}

	public void setYeuCauThayDoiTtCb(YeuCauThayDoiTtCb yeuCauThayDoiTtCb) {
		this.yeuCauThayDoiTtCb = yeuCauThayDoiTtCb;
	}

	@Column(name = "Gia_Tri_Thay_Doi", length = 254)
	public String getGiaTriThayDoi() {
		return this.giaTriThayDoi;
	}

	public void setGiaTriThayDoi(String giaTriThayDoi) {
		this.giaTriThayDoi = giaTriThayDoi;
	}

	@Column(name = "Ten_Hien_Thi", length = 254)
	public String getTenHienThi() {
		return this.tenHienThi;
	}

	public void setTenHienThi(String tenHienThi) {
		this.tenHienThi = tenHienThi;
	}

}