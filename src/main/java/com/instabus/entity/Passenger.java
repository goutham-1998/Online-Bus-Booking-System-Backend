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
@Table(name = "passengers",schema = "hr")
@Data @NoArgsConstructor @AllArgsConstructor
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passengerId;
	
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private Double luggage;

}
