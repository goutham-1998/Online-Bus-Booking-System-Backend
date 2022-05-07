package com.instabus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Entity
	@Table(name = "admins",schema = "hr")
    @Data @NoArgsConstructor @AllArgsConstructor
	public class Admin {

		@Id
		private int adminId;
		@Column(nullable = false)
		private String password;
		@Column(nullable = false)
		private String adminName;


}
