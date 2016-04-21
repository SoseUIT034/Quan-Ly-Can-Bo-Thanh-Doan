package com.springmvc.qlcb.model;
// Generated Apr 19, 2016 9:35:55 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tongiao generated by hbm2java
 */
@Entity
@Table(name = "tongiao", catalog = "qlcb_new")
public class Tongiao implements java.io.Serializable {

	private int id;
	private String tenTonGiao;
	private Set<Lylich> lyliches = new HashSet<Lylich>(0);

	public Tongiao() {
	}

	public Tongiao(int id, String tenTonGiao) {
		this.id = id;
		this.tenTonGiao = tenTonGiao;
	}

	public Tongiao(int id, String tenTonGiao, Set<Lylich> lyliches) {
		this.id = id;
		this.tenTonGiao = tenTonGiao;
		this.lyliches = lyliches;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "TenTonGiao", nullable = false, length = 200)
	public String getTenTonGiao() {
		return this.tenTonGiao;
	}

	public void setTenTonGiao(String tenTonGiao) {
		this.tenTonGiao = tenTonGiao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tongiao")
	public Set<Lylich> getLyliches() {
		return this.lyliches;
	}

	public void setLyliches(Set<Lylich> lyliches) {
		this.lyliches = lyliches;
	}

}