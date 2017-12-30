package com.springstore.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="userbase")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Size(min=3, max=50)
	@Column(name = "USERNAME", nullable = false)
	private String username;

	@NotNull
	@Size(min=3, max=50)
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
//	@NotNull
//	@DateTimeFormat(pattern="dd/MM/yyyy") 
//	@Column(name = "ENTERING_DATE", nullable = false)
//	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
//	private LocalDate enteringDate;
//
//	@NotNull
//	@Column(name = "nationality", nullable = false)
//	private String nationality;
//	
//	@NotEmpty
//	@Column(name = "CODE", unique=true, nullable = false)
//	private String code;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof Student))
//			return false;
//		Student other = (Student) obj;
//		if (id != other.id)
//			return false;
//		if (code == null) {
//			if (other.code != null)
//				return false;
//		} else if (!code.equals(other.code))
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", enteringDate="
//				+ enteringDate + ", nationality=" + nationality + ", code=" + code + "]";
//	}
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((code == null) ? 0 : code.hashCode());
//		return result;
//	}
	
	

}
