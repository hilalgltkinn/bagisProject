package com.takim4.bagisProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "institutions")
@Data
public class Institutions extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int institutionsId;

    @Column(name = "institutions_name")
	private String institutionsname;
	
    @Column(name = "duty_no")
	private String dutyNo;
}
