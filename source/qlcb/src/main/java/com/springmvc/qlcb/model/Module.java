package com.springmvc.qlcb.model;
// Generated Apr 11, 2016 10:54:37 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Module generated by hbm2java
 */
@Entity
@Table(name = "module", catalog = "qlcb")
public class Module implements java.io.Serializable {

	private String moduleName;
	private String moduleDisplayName;
	private Set<Controller> controllers = new HashSet<Controller>(0);

	public Module() {
	}

	public Module(String moduleName) {
		this.moduleName = moduleName;
	}

	public Module(String moduleName, String moduleDisplayName, Set<Controller> controllers) {
		this.moduleName = moduleName;
		this.moduleDisplayName = moduleDisplayName;
		this.controllers = controllers;
	}

	@Id

	@Column(name = "Module_Name", unique = true, nullable = false, length = 32)
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@Column(name = "Module_Display_Name", length = 254)
	public String getModuleDisplayName() {
		return this.moduleDisplayName;
	}

	public void setModuleDisplayName(String moduleDisplayName) {
		this.moduleDisplayName = moduleDisplayName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "module")
	public Set<Controller> getControllers() {
		return this.controllers;
	}

	public void setControllers(Set<Controller> controllers) {
		this.controllers = controllers;
	}

}